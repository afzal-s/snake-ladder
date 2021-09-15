package com.bridgelabz.game;

import java.util.Random;
import java.util.Scanner;

public class SnakeLadder {

	public static void main(String[] args) {
		int startPosition = 0, numberOfPlayer = 1;

		System.out.println("Number Of Player: " + numberOfPlayer);
		System.out.println("Current Position: " + startPosition);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Press 1 To Roll Dice: ");
		int number = scanner.nextInt();

		if (number == 1) {
			Random random = new Random();
			int dice = 1 + random.nextInt(6);
			System.out.println("Dice Rolling...");
			System.out.println("Dice Number: " + dice);
		} else {
			System.out.println("Error: Run The Program Again & Enter Valid Number");
		}

	}
}
