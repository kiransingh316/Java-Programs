package assignment1;

import java.util.Scanner;

public class EvenOddFinder {
	public static void main(String arr[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = s.nextInt();
		if(num%2==0)
			System.out.println(num + " is a even.");
		else
			System.out.println(num + " is a odd.");
		s.close();
	}
}
