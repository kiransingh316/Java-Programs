package Palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String arr[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1 = s.nextLine();

		char a[] = s1.toCharArray();

		StringBuilder s2 = new StringBuilder();

		for (int i = a.length - 1; i >= 0; i--) {
			s2.append(a[i]);
		}
		String s3 = s2.toString();
		if (s1.equals(s3)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		s.close();
	}
}
