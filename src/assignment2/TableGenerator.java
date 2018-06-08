package assignment2;

import java.util.Scanner;

public class TableGenerator {
	public static void main(String arr[]){
		int i, num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		num=s.nextInt();
		System.out.println("Table of "+num+":");
		
		for(i=1; i<=10;i++){
			//int mul=num*i;
			System.out.println(num+" X "+ i+" = "+num*i);
		}
		//System.out.println("Table End");
		s.close();
	}
}
