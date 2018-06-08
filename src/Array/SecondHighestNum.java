package Array;

import java.util.Arrays;

public class SecondHighestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 6, 0, 8, 6, 9, 8 };
		System.out.println("Array before Sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("\n");

		// Sort Array
		// Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < (a.length - i); j++) {
				if (a[j - 1] < a[j]) {
					// swap elements
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		// Print array after sorting
		System.out.println("Array after Sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("\n");
		int size=a.length;
		System.out.println("Second Highest Value: " + a[size-2]);
	}

}
