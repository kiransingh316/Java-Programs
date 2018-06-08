package assignment1;

import java.util.Scanner;

public class ProfitLossFinder {
	public static void main(String aa[]) {
		float profit, loss;
		// profitper, lossper;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Cost Prize:");
		float CP = s.nextFloat();
		System.out.println("Enter Selling Prize:");
		float SP = s.nextFloat();
		if (SP > CP) {
			profit = SP - CP;
			// profitper = (profit / CP) * 100;
			System.out.println("Profit of Rs. "+profit+" is incurred");
			// System.out.println("Profit percentage is" + profitper + "%");
		} else if (CP > SP) {
			loss = CP - SP;
			// lossper = (loss / CP) * 100;
			System.out.println("Loss of Rs. "+loss+" is incurred");
			// System.out.println("Loss percentage is" + lossper + "%");
		} else {
			System.out.println("No Profit, No Loss");
		}
		s.close();
	}
}
