package Array;

public class SortWithOneLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = { 2, 3, 4, 6, 8, 1, 0, 8, -1 };
		int n = x.length;
		// boolean again;

		System.out.println("Array before Sorting:");
		for (int i = 0; i <= n - 1; i++) {
			System.out.print(x[i] + " ");
			// System.out.print("\n");
		}
		System.out.print("\n");

		//Main Code
		int j = 0;
		int prevI = 0;
		for (int i = 0; i < n - 1; i++) {
			j++;
			if (j < n) {
				i = prevI;
			} else {
				j = i + 1;
			}

			if (x[i] < x[j]) {
				int temp = x[i];
				x[i] = x[j];
				x[j] = temp;
			}
			prevI = i;
		}
		//Finish Main Code
		
		System.out.println("Array after Sorting:");
		for (int i = 0; i <= n - 1; i++) {
			System.out.print(x[i] + " ");
		}
	}
}
