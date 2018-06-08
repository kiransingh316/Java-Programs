package assignment1;

import java.util.Scanner;

public class GradeFinder {

	public static void main(String arr[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Marks Obtained:");
		float number = s.nextFloat();
		if((number<=100)&&(number>=90.01))
			System.out.println("Your grade is A+.");
		else if((number<=90.0)&&(number>=80.01))
			System.out.println("Your grade is A.");
		else  if((number<=80.0)&&(number>=70.01))
			System.out.println("Your grade is B+.");
		else  if((number<=70.0)&&(number>=60.01))
			System.out.println("Your grade is B.");
		else  if((number<=60.0)&&(number>=50.01))
			System.out.println("Your grade is C+.");
		else  if((number<=50.0)&&(number>=40.01))
			System.out.println("Your grade is C.");
		else
			System.out.println("Fail or Invalid Input");
		s.close();
	}

}
