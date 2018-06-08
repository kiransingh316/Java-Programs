package assignment1;

import java.util.Scanner;

public class WhoIsYounger {
	public static void main(String arr[]) {
		int age = 0;
		System.out.println("Who is Younger?");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age of first person.:");
		int age1 = s.nextInt();
		System.out.println("Enter the age of second person.:");
		int age2 = s.nextInt();
		if (age1 == age2)
			System.out.println(" Both are same age");
		if (age1 > age2) {
			age = age1 - age2;
			System.out.println("The second person aged " + age + " years is the younger one.");
		} else {
			age = age2 - age1;
			System.out.println("The second person aged " + age + " years is the younger one.");
		}
		s.close();
	}
}
