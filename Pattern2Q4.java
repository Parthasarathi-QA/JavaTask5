package task5package;

import java.util.Scanner;

public class Pattern2Q4 {

	public static void main(String[] args) {

		// User input through Scanner Class object
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = obj.nextInt();

		// Validating the user input is Even or Odd
		if (num % 2 == 0) {
			System.out.println("Enter Odd number");
			return;
		}

		/*
		 * Proceeding with Odd User input ignoring the Even number as input
		 */

		// No.of Rows
		for (int i = 0; i < num; i++) {
			// No. of columns
			for (int j = 0; j < num; j++) {
				if (j == i || j == num - 1 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
