package task5package;

import java.util.Scanner;

public class PalindromeQ1 {

	public static void main(String[] args) {
		// User input through Scanner Class object
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String text = obj.nextLine();

		// Storing the Reverse String to the String Variable
		String reverseString = new StringBuilder(text).reverse().toString();

		System.out.println(text.equalsIgnoreCase(reverseString) ? "Entered String *"+text +"* is a Palindrome"
				: "Entered String *"+text +"* is not a Palindrome");
	}

}
