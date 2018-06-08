package LARA;

public class Program1 {

	public static void main(String arr[]) {
		/*
		 * System.out.println(10 + 20); System.out.println(10 - 20);
		 * System.out.println(10 * 20); System.out.println(10.0F / 20.0f);
		 */

		/*
		 * System.out.println(20 == 20); System.out.println(20 != 20);
		 * System.out.println(true != false); System.out.println(20 != 200);
		 */

		/*
		 * System.out.println('A'); System.out.println("/B/");
		 * System.out.println('\n'); System.out.println("D");
		 * System.out.println("E");
		 */

		/*
		 * int i = 0, j=10; int k=-1; System.out.println("i="+i);
		 * System.out.println("j="+j); System.out.println("k="+k);
		 * //System.out.println("i:"+i +",j:"+j); //i = 1;
		 * //System.out.println(j+" is value of j"); //i = 2;
		 * //System.out.println(i);
		 */

		/*
		 * int i=10; boolean b= false; double d=30.90; char c='k'; String
		 * s="ABC"; System.out.println("i= "+i); System.out.println("d= "+d);
		 * System.out.println("c= "+c); System.out.println("b= "+b);
		 * System.out.println("s= "+s); if (b){ System.out.println("True");
		 * }else{ System.out.println("False"); }
		 */

		/*
		 * final int y=0; System.out.println("y="+ y); System.out.println("y="+
		 * (y=11)); System.out.println("y="+ y);
		 */

		/*
		 * int i=10; int j= i+10; //int i=10; System.out.println(i);
		 * System.out.println(j); System.out.println(i + j + 20);
		 */

		/*
		 * int i=1; System.out.println(i); //i--; System.out.println(i--);
		 * System.out.println(i--); System.out.println(i);
		 * System.out.println("********"); int j=1; System.out.println(j);
		 * System.out.println(--j); System.out.println(--j);
		 * System.out.println(j);
		 */

		int i = 0;
		int j = i++ + i + ++i + i;
		// int j = 10+i++;
		// int j = i+ ++i;
		// int j = i++ + i;
		// int j = i++ + i++ + i;
		// System.out.println(i);
		// int j = i++ + i + i-- + i;
		// System.out.println(++i);
		System.out.println(i);
		System.out.println(j);

	}

}
