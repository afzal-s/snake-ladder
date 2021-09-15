package com.bridgelabz.game;

import java.util.Random;
import java.util.Scanner;

public class SnakeLadder {

	public static void main(String[] args) {
		int startPosition = 0, numberOfPlayer = 1;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Number Of Player: " + numberOfPlayer);
		System.out.println("Current Position: " + startPosition);

		// Start Game.
		System.out.print("Press 1 To Roll Dice: ");
		int number = scanner.nextInt();

		if (number == 1) {
			// Roll Dice To Get Number Between 1-6.
			Random random = new Random();
			int dice = 1 + random.nextInt(6);
			System.out.println("Dice Rolling...");
			System.out.println("Dice Number: " + dice);

			// To Get Random Number For No Play, Ladder, Snake.
			int checkOptions = random.nextInt(3);

			// To Check Options To No Play, Ladder Or Snake
			switch (checkOptions) {
			case 0:
				System.out.println("OPTION: No Play");
				break;
			case 1:
				System.out.println("OPTION: Ladder");
				startPosition = startPosition + dice;
				break;
			default:
				System.out.println("OPTION: Snake");
				startPosition = startPosition - dice;
				if (startPosition < 0) {
					startPosition = 0;
				}
				break;
			}

			System.out.println("Current Position: " + startPosition);
		} else {
			System.out.println("Error: Run The Program Again & Enter Valid Number");
		}

	}

}
