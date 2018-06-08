package assignment1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TaxCalculator {
	public static void main(String arr[]) {
		// define local variables
		double tax, totaltax;
		// float decimalNumber;

		// To print float data value with 2 decimal places
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		// System.out.println(df.format(decimalNumber));

		// To take input from keyboard
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your net Income in lacs:");
		float income = s.nextFloat();

		// To check distance value for less than 0
		if (income <= 0)
			System.out.println("Invalid Input");
		
		// Main Logic
		else {
			System.out.println("Your Tax Liability is: ");
			// Code for Up to 2.5 lac income @Nil tax
			if (income <= 2.5) {
				System.out.println("First " + income + " Lac : 0 Rs.");
				totaltax = 0;
			}

			// Code for More than 2.5 lac to 5.0 lac income @10% tax
			else if ((income >2.5) && (income <= 5.0)) {
				System.out.println("First 2.5 lac	 : 0 Rs.");
				//Use 'Math.ceil' to 
				tax = Math.ceil(((income - 2.5)*100000)*0.1);
				System.out.println("Next " + df.format((income - 2.5)) + " Lac @ 10% :" + df.format(tax) + " Rs.");
				totaltax = Math.ceil(0 + tax);
			}

			// Code for More than 5 lac to 10 lac income @20% tax
			else 
			{
				if ((income > 5.0) && ( income <= 10.0)) {
				System.out.println("First 2.5 lac	 : 0 Rs.");
				System.out.println("Next  2.5 lac @ 10%	 :25,000 Rs.");
				tax = Math.ceil(((income - 5.0)*100000)*0.2);
				System.out.println("Next " + df.format((income - 5.0)) + " Lac @ 20% :" + df.format(tax) + " Rs.");
				totaltax = Math.ceil (0 + 25000+ tax);
			} 
			// Code for More than 10 lac income @30% tax
				else{
			System.out.println("First 2.5 lac	 : 0 Rs.");
			System.out.println("Next  2.5 lac @ 10%	 :25,000 Rs.");
			System.out.println("Next  5 lac @ 20%	 :1,00,000 Rs.");
		    tax =  Math.ceil(((income - 10.0)*100000)*0.3);
		    System.out.println("Next " + df.format((income - 10)) + " LAc @ 30%	:" + df.format(tax) + " Rs.");
		    totaltax = Math.ceil(0 + 25000 + 100000+ tax);
			}
		}
			System.out.println("-----------------------------");
			System.out.println("Total " + income + " Lac	 : " + df.format(totaltax) + " Rs.");
		}
	// close scanner object
	s.close();

}

}
