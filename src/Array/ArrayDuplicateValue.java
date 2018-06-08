package Array;

public class ArrayDuplicateValue {
	// int a[]={1,1,7,8,27,9,9,9,7,1};
	// int count=1;
	public static void main(String arr[]) {
		int a[] = { 1, 1, 7, 8, 27, 9, 9, 9, 7, 1 };
		//int count = 1;
		// Print array before sorting
		System.out.println("Array before Sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("\n");

		// Sort Array
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < (a.length - i); j++) {
				if (a[j - 1] > a[j]) {
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
		// Find duplicate value in array

		for (int i = 0; i < a.length - 1; i++) {
			int count = 1;
			int j = i + 1;
			for (; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				} else
					break;
			}
			if (count > 1) {
				//System.out.println(i +" and "+ j);
				System.out.println("Value " + a[i] + " contaions " + count + " duplicate values");
				i = j-1;
			}
		}
	}
}
