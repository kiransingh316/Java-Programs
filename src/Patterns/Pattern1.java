// 1st Pattern	
/*
 * 			*****
 *			****
 *			***
 *			**
 *			*
 */

package Patterns;

public class Pattern1 {
	public static void main(String arr[]) {
		int i, j, k, n = 5;
		/*
		 * for(int i=5; i>=1; i--) { for(int j=1; j<=i;j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */

		// 2nd Pattern
/*
		 * * 
		 * ** 
		 * *** 
		 * **** 
		 * *****
/*
		 * for(i=5; i>=1; i--) { for(j=5; j>i;j--) { System.out.print(" "); }
		 * for(k=1; k<=i;k++) { System.out.print("*"); } System.out.println(); }
		 */

		// 3rd Pattern

		/*
		 * * * * * * * * * * * *
		 * 
		 */
		/*
		 * for(i=5; i>=1; i--) { for(j=5; j>i;j--) { System.out.print(" "); }
		 * for(k=1; k<=i;k++) { System.out.print("* "); } System.out.println();
		 * }
		 */

		// 4th Pattern
		/*
		 * * * * * * * * * * * * for(i=1; i<=5; i++) { for(j=5; j>i;j--) {
		 * System.out.print(" "); } for(k=1; k<=i;k++) { System.out.print("* ");
		 * } System.out.println(); }
		 */

		// 3rd Pattern
		/*
		 * * * *
		 * 
		 * * *
		 */
		for (i = 5; i >= 1; i--) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				// Apply condition to make X pattern otherwise execute for * for
				// all condition to make hour watch pattern
				if (k == 1 || k == i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			i--;
			System.out.println();
		}

		for (i = 3; i <= 5; i++) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				// Apply condition to make X pattern otherwise execute for * for
				// all condition to make hour watch pattern
				if (k == 1 || k == i)
					if (k == 1 || k == i)
						System.out.print("* ");
					else
						System.out.print("  ");
			}
			i++;
			System.out.println();
		}

		/*
		 ********
		 ******
		 *****
		 ****
		 ***
		 **
		 *
		 **
		 ***
		 ****
		 *****
		 ******
		 *******
		 */
		/*
		 * for(i=7; i>=1; i--) { for(j=5; j>i;j--) { System.out.print(" "); }
		 * for(k=1; k<=i;k++) { System.out.print("*"); } System.out.println(); }
		 * 
		 * for(i=2; i<=7; i++) { for(j=5; j>i;j--) { System.out.print(" "); }
		 * for(k=1; k<=i;k++) { System.out.print("*"); } System.out.println(); }
		 */

	}

}
