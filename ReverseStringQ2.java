package task5package;

import java.util.Scanner;

public class ReverseStringQ2 {

	public static void main(String[] args) {

		// User input through Scanner Class object
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the String is: ");
		String text = obj.nextLine();
		
		//getting the Length of String to String variable
		int strLength = text.length();

		String reversed = "";
		
		//for loop to traverse each character
		for (int i = strLength - 1; i >= 0; i--) {
			reversed += text.charAt(i);
		}
		System.out.println("Reversed String is: " + reversed.toLowerCase());
	}

}
