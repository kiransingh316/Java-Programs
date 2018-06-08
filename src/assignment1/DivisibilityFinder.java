package assignment1;

import java.util.Scanner;

public class DivisibilityFinder {

	public static void main(String arr[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number = s.nextInt();
		System.out.println("Enter the Divisor:");
		int divisor = s.nextInt();
		if(number%divisor==0)
			System.out.println(number+" is divisible by "+divisor);
		else
			System.out.println(number+" is not divisible by "+divisor);
		s.close();
	}
}
