package task5package;

import java.util.Scanner;

public class ThreeIntComparisonQ7 {

	public static void main(String[] args) {

		// User input through Scanner Class object
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the value of integer a: ");
		int a = obj.nextInt();

		System.out.println("Enter the value of integer b: ");
		int b = obj.nextInt();

		System.out.println("Enter the value of integer c: ");
		int c = obj.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " is larger than " + b + " & " + c);
		} else if (b > c && b > a) {
			System.out.println(b + " is larger than " + a + " & " + c);
		} else {
			System.out.println(c + " is larger than " + b + " & " + a);
		}

	}

}
