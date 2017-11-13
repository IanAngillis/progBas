package fourinarow;

import java.util.Scanner;
import java.util.Random;

public class FourInARowWithAI {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);
		// Variabelen
		String player1 = new String("");
		String player2 = "the computer";
		char[][] gameBoard = new char[7][8];
		int currentPlayer = 0;
		int round = 0;
		boolean playerHasWon = false;
		int row;
		int colum = 0;

		// Getting player names
		System.out.println("Naam speler 1: ");
		player1 = keyboard.nextLine();

		System.out.println();

		// Prepare the gameboard
		resetBoard(gameBoard);
		printBoard(gameBoard);
		System.out.println();

		while (!playerHasWon) {
			// Sets currentplayer
			currentPlayer = getCurrentPlayer(round);
			printCurrentPlayerTurn(currentPlayer, player1, player2);

			// Print bord:
			System.out.println();

			if (currentPlayer == 1) {
				// Get Row and Colum
				colum = getColum();

				// Checks wether position is already taken or not
				while (gameBoard[1][colum] != '.') {
					System.out.println("That colum is already full! Choose another.");
					colum = getColum();
				}
			} else {

				colum = calculateAIMove(gameBoard, colum);

				if (colum == 0) {
					colum = rand.nextInt(7) + 1;

					// Checks wether position is already taken or not
					while (gameBoard[1][colum] != '.') {
						colum = rand.nextInt(7) + 1;
					}
				}
			}

			setPosition(gameBoard, currentPlayer, colum);
			printBoard(gameBoard);

			if (gameBoardIsFull(gameBoard)) {
				round++;
				System.out.println("Het is een gelijkspel, volgende keer beter!");
				playerHasWon = true;
			}

			if (victoryConditions(gameBoard, currentPlayer, colum)) {
				round++;
				printVictoryMessage(currentPlayer, round, player1, player2);
				playerHasWon = true;
			}

			round++;
		}

		keyboard.close();
	}

	public static int calculateAIMove(char[][] gameBoard, int colum) {
		char chip = 'O';
		int row = getRow(gameBoard, colum);

		int chipsInARowDiagonal1 = 1;
		int chipsInARowDiagonal2 = 1;
		int chipsInARowHorizontal = 1;
		int chipsInARowVertical = 1;

		chipsInARowDiagonal2 += checkUpperRight(gameBoard, row, colum, chip);
		chipsInARowHorizontal += checkRight(gameBoard, row, colum, chip);
		chipsInARowDiagonal1 += checkLowerRight(gameBoard, row, colum, chip);
		chipsInARowVertical += checkDown(gameBoard, row, colum, chip);
		chipsInARowDiagonal2 += checkLowerLeft(gameBoard, row, colum, chip);
		chipsInARowHorizontal += checkLeft(gameBoard, row, colum, chip);
		chipsInARowDiagonal1 += checkUpperLeft(gameBoard, row, colum, chip);

		int AIcolum = chipCheckerAI(gameBoard, chipsInARowDiagonal1, chipsInARowDiagonal2, chipsInARowHorizontal,
				chipsInARowVertical, row, colum);

		return AIcolum;
	}

	public static int chipCheckerAI(char[][] gameBoard, int diagonal1, int diagonal2, int horizontal, int vertical,
			int row, int colum) {
		int AIcolum = 0;
		int AIrow = row;

		if (vertical == 3) {
			AIrow--;
			AIcolum = colum;

			if (AIrow == 0) {
				AIcolum = 0;
			}

			return AIcolum;
		}

		if (horizontal == 3) {
	
			if (colum - 1 > 0 && AIrow + 1 < 7) {

				if (gameBoard[AIrow][colum - 1] == '.' && gameBoard[AIrow + 1][colum - 1] != '.') {
					AIcolum = colum - 1;
					return AIcolum;
				}
			} else if (colum + 1 < 8 && AIrow + 1 < 7) {
				if (gameBoard[AIrow][colum + 1] == '.' && gameBoard[AIrow + 1][colum + 1] != '.') {
					AIcolum = colum + 1;
					return AIcolum;
				}
			} else {
				AIcolum = 0;
			}
		}

		return AIcolum;
	}

	public static boolean gameBoardIsFull(char[][] gameBoard) {

		for (int i = 0; i < gameBoard.length; i++) {

			for (int j = 0; j < gameBoard[i].length; j++) {

				if (gameBoard[i][j] == '.') {
					return false;
				}
			}
		}

		return true;
	}

	public static void printVictoryMessage(int currentPlayer, int round, String player1, String player2) {

		if (currentPlayer == 1) {
			System.out.println(player1 + " heeft het spel gewonnen na " + round + " rondes!");
		} else {
			System.out.println(player2 + " heeft het spel gewonnen na " + round + " rondes!");
		}
	}

	public static boolean victoryConditions(char[][] gameBoard, int currentPlayer, int colum) {
		char chip = getChip(currentPlayer);
		int row = getRow(gameBoard, colum);
		boolean playerHasWon = false;

		playerHasWon = checkPosition(gameBoard, row, colum, chip);

		return playerHasWon;
	}

	public static boolean checkPosition(char[][] gameBoard, int row, int colum, char chip) {

		int chipsInARowDiagonal1 = 1;
		int chipsInARowDiagonal2 = 1;
		int chipsInARowHorizontal = 1;
		int chipsInARowVertical = 1;

		chipsInARowDiagonal2 += checkUpperRight(gameBoard, row, colum, chip);
		chipsInARowHorizontal += checkRight(gameBoard, row, colum, chip);
		chipsInARowDiagonal1 += checkLowerRight(gameBoard, row, colum, chip);
		chipsInARowVertical += checkDown(gameBoard, row, colum, chip);
		chipsInARowDiagonal2 += checkLowerLeft(gameBoard, row, colum, chip);
		chipsInARowHorizontal += checkLeft(gameBoard, row, colum, chip);
		chipsInARowDiagonal1 += checkUpperLeft(gameBoard, row, colum, chip);

		if (chipChecker(chipsInARowDiagonal1, chipsInARowDiagonal2, chipsInARowHorizontal, chipsInARowVertical)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean chipChecker(int diagonal1, int diagonal2, int horizontal, int vertical) {
		if (diagonal1 >= 4 || diagonal2 >= 4 || horizontal >= 4 || vertical >= 4) {
			return true;
		} else {
			return false;
		}
	}

	public static int checkUpperRight(char[][] gameBoard, int row, int colum, char chip) {
		int score = 0;

		row--;
		colum++;

		while (row > 0 && colum < 8) {

			if (gameBoard[row][colum] == chip) {
				score++;
			} else {
				return score;
			}

			row--;
			colum++;
		}

		return score;
	}

	public static int checkRight(char[][] gameBoard, int row, int colum, char chip) {
		int score = 0;

		colum++;

		while (colum < 8) {

			if (gameBoard[row][colum] == chip) {
				score++;
			} else {
				return score;
			}

			colum++;
		}

		return score;
	}

	public static int checkLowerRight(char[][] gameBoard, int row, int colum, char chip) {
		int score = 0;

		row++;
		colum++;

		while (row < 7 && colum < 8) {

			if (gameBoard[row][colum] == chip) {
				score++;
			} else {
				return score;
			}

			row++;
			colum++;
		}

		return score;
	}

	public static int checkDown(char[][] gameBoard, int row, int colum, char chip) {
		int score = 0;

		row++;

		while (row < 7) {

			if (gameBoard[row][colum] == chip) {
				score++;
			} else {
				return score;
			}

			row++;
		}

		return score;
	}

	public static int checkLowerLeft(char[][] gameBoard, int row, int colum, char chip) {
		int score = 0;

		row++;
		colum--;

		while (row < 7 && colum > 0) {

			if (gameBoard[row][colum] == chip) {
				score++;
			} else {
				return score;
			}

			row++;
			colum--;
		}

		return score;
	}

	public static int checkLeft(char[][] gameBoard, int row, int colum, char chip) {
		int score = 0;

		colum--;

		while (colum > 0) {

			if (gameBoard[row][colum] == chip) {
				score++;
			} else {
				return score;
			}

			colum--;
		}

		return score;
	}

	public static int checkUpperLeft(char[][] gameBoard, int row, int colum, char chip) {
		int score = 0;

		row--;
		colum--;

		while (row > 0 && colum > 0) {

			if (gameBoard[row][colum] == chip) {
				score++;
			} else {
				return score;
			}

			row--;
			colum--;
		}

		return score;
	}

	public static void setPosition(char[][] gameBoard, int currentPlayer, int colum) {

		char chip = getChip(currentPlayer);

		for (int i = 0; i < gameBoard.length; i++) {

			if (gameBoard[gameBoard.length - 1 - i][colum] == '.') {
				gameBoard[gameBoard.length - 1 - i][colum] = chip;
				break;
			}
		}
	}

	public static char getChip(int currentPlayer) {

		if (currentPlayer == 1) {
			return 'O';
		} else {
			return 'X';
		}
	}

	/*
	 * public static boolean positionIsTaken(char [][] gameBoard, int row, int
	 * colum) {
	 * 
	 * if(gameBoard[row][colum] != '.') { return true; } else { return false; } }
	 */

	public static int getColum() {
		Scanner keyboard = new Scanner(System.in);
		int colum;

		System.out.println("Colum: ");
		colum = keyboard.nextInt();

		while (colum < 1 || colum > 7) {
			System.out.println("That colum does not exist!");
			System.out.println("Colum: ");
			colum = keyboard.nextInt();
		}

		return colum;
	}

	public static int getRow(char[][] gameBoard, int colum) {
		int row = 0;

		for (int i = 1; i < gameBoard.length; i++) {

			if (gameBoard[i][colum] != '.') {
				row = i;
				break;
			}
		}

		return row;
	}

	public static void printCurrentPlayerTurn(int currentPlayer, String player1, String player2) {

		if (currentPlayer == 1) {
			System.out.println("It's " + player1 + " his turn!");
		} else {
			System.out.println("It's " + player2 + " his turn!");
		}

		System.out.println();
	}

	public static int getCurrentPlayer(int round) {

		if (round % 2 == 0) {
			return 1;
		} else {
			return 2;
		}
	}

	public static void printBoard(char[][] gameBoard) {
		for (int i = 0; i < gameBoard.length; i++) {

			for (int j = 0; j < gameBoard[i].length; j++) {

				System.out.print(gameBoard[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println();
	}

	public static void resetBoard(char[][] gameBoard) {

		resetIndexes(gameBoard);
		resetGame(gameBoard);
	}

	public static void resetIndexes(char[][] gameBoard) {

		char index;

		for (int i = 0; i < gameBoard[0].length; i++) {

			if (i == 0) {
				gameBoard[0][i] = ' ';

			} else {
				index = getIndex(i);
				gameBoard[0][i] = index;

				if (i < gameBoard.length) {
					gameBoard[i][0] = ' ';
				}
			}
		}
	}

	public static char getIndex(int i) {
		String temp = i + "";

		return temp.charAt(0);
	}

	public static void resetGame(char[][] gameBoard) {

		for (int i = 1; i < gameBoard.length; i++) {

			for (int j = 1; j < gameBoard[i].length; j++) {

				gameBoard[i][j] = '.';
			}
		}
	}

}
