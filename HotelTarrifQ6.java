package task5package;

import java.util.Scanner;

public class HotelTarrifQ6 {

	public static void main(String[] args) {

		// User input through Scanner Class object
		Scanner obj = new Scanner(System.in);

		// Input - Month
		// System.out.println("Enter the month: ");
		int month = obj.nextInt();

		// Input - Rent per day
		// System.out.println("Enter the room rent per day: ");
		float rent = obj.nextFloat();

		// Input - No.of days
		// System.out.println("Enter the Number of days: ");
		int noOfDays = obj.nextInt();

		float tarrif = rent * noOfDays;

		switch (month) {
		case 1: {
			System.out.printf("%.2f", tarrif);// January
			break;
		}
		case 2: {
			System.out.printf("%.2f", tarrif);// February
			break;
		}
		case 3: {
			System.out.printf("%.2f", tarrif);// March
			break;
		}
		case 4: {
			System.out.printf("%.2f", (tarrif) - (tarrif * (20 / 100)));// April
			break;
		}
		case 5: {
			System.out.printf("%.2f", (tarrif) - (tarrif * (20 / 100)));// May
			break;
		}
		case 6: {
			System.out.printf("%.2f", (tarrif) - (tarrif * (20 / 100)));// June
			break;
		}
		case 7: {
			System.out.printf("%.2f", tarrif);// July
			break;
		}
		case 8: {
			System.out.printf("%.2f", tarrif);// August
			break;
		}
		case 9: {
			System.out.printf("%.2f", tarrif);// September
			break;
		}
		case 10: {
			System.out.printf("%.2f", (tarrif) - (tarrif * (20 / 100)));// October
			break;
		}
		case 11: {
			System.out.printf("%.2f", (tarrif) - (tarrif * (20 / 100)));// November
			break;
		}
		case 12: {
			System.out.printf("%.2f", (tarrif) - (tarrif * (20 / 100)));// December
			break;
		}
		default: {
			System.out.println("Thanks for the stay");
			break;
		}

		}

	}
}
