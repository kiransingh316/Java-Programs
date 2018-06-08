package LARA;

public class Program2 {

	public static void main(String[] args) {
		int i = 0;
		System.out.println(test1(i++));
		//System.out.println(test2());
		//i=5;
		//int k = i + j + test1() + test2();
		System.out.println(test1(++i));
	}
	static int test1(int i){
		return i++;
	}

}
