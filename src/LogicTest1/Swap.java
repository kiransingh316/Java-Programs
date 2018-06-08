package LogicTest1;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 78;
		int b = 89;

		System.out.println("Before Swap");
		System.out.println("a= " + a + " and b= " + b);

		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println("After Swap");
		System.out.print("a= " + a + " and b= " + b);

	}

}
