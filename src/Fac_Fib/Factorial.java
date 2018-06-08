package Fac_Fib;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		long fact = 1;
		// number=5;//It is the number to calculate factorial
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = s.nextInt();
		//Calculate Factorial Value
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
			//System.out.println(fact + " " + i);
		}
		System.out.println("Factorial of " + number + " is: " + fact);
		s.close();
	}
}
