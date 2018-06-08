package assignment1;

import java.util.Scanner;

public class LeapYearFinder {

	public static void main(String arr[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an Year:");
		int y = s.nextInt();
		if ((y % 4 == 0) && (y % 100 != 0)) {
				System.out.println(y + " is leap year.");
		} else if (y % 400 == 0)
			System.out.println(y + " is leap year.");
		else
			System.out.println(y + " is not a leap year.");
		s.close();
	}
}
