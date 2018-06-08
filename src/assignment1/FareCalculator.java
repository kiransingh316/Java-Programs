package assignment1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FareCalculator {
	public static void main(String arr[]) {
		// define local variables
		float fare, totalfare = 0f;
		// float decimalNumber;

		// To print float data value with 2 decimal places
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		// System.out.println(df.format(decimalNumber));

		// To take input from keyboard
		Scanner s = new Scanner(System.in);
		System.out.println("Enter distance covered:");
		float distance = s.nextFloat();

		// To check distance value for less than 0
		if (distance <= 0)
			System.out.println("Invalid Input");

		else {
			// Main Logic
			// Code for <=5 KM ride
			if (distance <= 5) {
				System.out.println("First " + distance + " KM	 : 50 Rs.");
				totalfare = 50;
				// System.out.println("-----------------------------");
				// System.out.println("Total "+ distance+" KM : 50 Rs.");
			}

			// Code for >5 and <=20 KM ride
			else if ((distance - 5) <= 15) {
				System.out.println("First 5 KM	 : 50 Rs.");
				fare = (distance - 5) * 12;
				System.out.println("Next " + df.format((distance - 5)) + " KM @ 12 Rs. :" + df.format(fare) + " Rs.");
				totalfare = 50 + fare;
				// System.out.println("-----------------------------");
				// System.out.println("Total "+ distance+" KM : "+
				// df.format((50+fare))+" Rs.");
			}

			// Code for >20 KM ride
			else {
				System.out.println("First 5 KM	 : 50 Rs.");
				System.out.println("Next  15 KM @ 12 Rs.	 :180 Rs.");
				fare = ((distance - 20) * 14);
				System.out.println("Next " + df.format((distance - 20)) + " KM @ 14 Rs.	 :" + df.format(fare) + " Rs.");
				totalfare = 50 + 180 + fare;
				// System.out.println("-----------------------------");
				// System.out.println("Total "+ distance+" KM :
				// "+df.format((50+180+fare))+" Rs.");
			}

			System.out.println("-----------------------------");
			System.out.println("Total " + distance + " KM	 : " + df.format(totalfare) + " Rs.");
		}
		// close scanner object
		s.close();

	}

}
