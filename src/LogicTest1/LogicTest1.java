package LogicTest1;

public class LogicTest1 {

	public static void main(String[] args) {
	
		int a[] = { -1, 0, -9, 9, 8, 7, -1, 0, 8, 6 };
		// Before Sorting
		System.out.println("Before Sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.print("\n");
		
		// Sorting
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length - 1; j++) {
				if (a[j - 1] > a[j]) {
					a[j - 1] = a[j - 1] * a[j];
					a[j] = a[j - 1] / a[j];
					a[j - 1] = a[j - 1] / a[j];
				}
			}
		}
		// After Sorting
		System.out.println("After Sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.print("\n");
	}

}
