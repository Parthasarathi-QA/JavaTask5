package task5package;

import java.util.Scanner;

public class ProblemQ5 {

	public static void main(String[] args) {
		
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the mark of Student: ");
		int mark = obj.nextInt();

		if (mark == 100) {
			System.out.println("Student Grade: S");
		} else if (mark >= 90 && mark <= 99) {
			System.out.println("Student Grade: A");
		} else if (mark >= 80 && mark <= 89) {
			System.out.println("Student Grade: B");
		} else if (mark >= 70 && mark <= 79) {
			System.out.println("Student Grade: C");
		} else if (mark >= 60 && mark <= 69) {
			System.out.println("Student Grade: D");
		} else if (mark >= 50 && mark <= 59) {
			System.out.println("Student Grade: E");
		} else if (mark < 50) {
			System.out.println("Student Grade: F");
		} else if (mark > 100) {
			System.out.println("Invalid Input");
		}

	}

}
