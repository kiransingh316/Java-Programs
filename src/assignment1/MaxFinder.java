package assignment1;

import java.util.Scanner;

public class MaxFinder {
	
	public static void main(String arr[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First No.");
		int a = s.nextInt();
		System.out.println("Enter Second No.");
		int b = s.nextInt();
		if(a==b)
			System.out.println(" Both a and b values are same");
		if (a>b)
			System.out.println("Then the output should be:"+a+ "is max number.");
		else
			System.out.println("Then the output should be:"+ b +"is max number.");
		s.close();
	}
}
