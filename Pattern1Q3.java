package task5package;

import java.util.Scanner;

public class Pattern1Q3 {

	public static void main(String[] args) {

		// User input through Scanner Class object
		Scanner obj = new Scanner(System.in);
		int m = obj.nextInt();
		//Initial value
		int num = 1;
		
		//No. of rows
		for (int i = 1; i <= m; i++) {
			//No of columns
			for (int j = 1; j <= i; j++) {
				if (i == j) {
					System.out.println(num);
				} else {
					System.out.print(num + " ");
				}
				num += 1;
			}

		}
	}

}
