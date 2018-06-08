package Strings;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReverseStringTest {
	public static void main(String args[]) throws FileNotFoundException, IOException {

		// original string
		//String str = "Hello My Name Is Kiran";
		Scanner s=new Scanner(System.in);
		System.out.println("Original String:");
		String str= s.nextLine();
		//System.out.println("Original String: " + str);

		// iterative method to reverse String in Java
		String reverseStr = ReverseString.PrintReverse(str);
		System.out.println("Reverse String in Java using Iteration: " + reverseStr);

	}

}
