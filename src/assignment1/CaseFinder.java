package assignment1;

import java.util.Scanner;

public class CaseFinder {

	public static void main(String arr[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch = s.next().charAt(0);

		if (((int) ch >= 97) && ((int) ch <= 122))
			System.out.println(ch + " is an lower case character.");
		else if (((int) ch >= 65) && ((int) ch <= 90))
			System.out.println(ch + " is an upper case character.");
		else
			System.out.println(ch + " is not an alphabet input");
		s.close();
	}

}
