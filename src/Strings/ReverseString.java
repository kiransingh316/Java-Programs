package Strings;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReverseString {



	public static String PrintReverse(String str) {
		StringBuilder strBuilder = new StringBuilder();
		StringBuilder strBuilder2 = new StringBuilder();

		//convert string to array
		char[] strChars = str.toCharArray();

		for (int i = strChars.length - 1; i >= 0; i--) {

			if (i == 0) {
				strBuilder2.append(strChars[i]);
				strBuilder.append(strBuilder2.reverse());
			}

			if (String.valueOf(strChars[i]).equals(" ")) {
				strBuilder.append(strBuilder2.reverse());
				strBuilder.append(' ');
				strBuilder2.setLength(0);
				i--;
			}

			strBuilder2.append(strChars[i]);

		}
		return strBuilder.toString();
	}
	
	public static String reverseRecursively(String str) {

		// base case to handle one char string and empty string
		if (str.length() < 2) {
			return str;
		}
		System.out.println(str.charAt(0));
		return reverseRecursively(str.substring(1)) + str.charAt(0);
		
	}
}

