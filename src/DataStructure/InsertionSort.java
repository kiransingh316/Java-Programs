package DataStructure;

public class InsertionSort {
	public static void main(String arr[]) {
		int a[] = { 1, 9, 3, 87, 0, 9, 6, 1, -1 };
		for (int j = 2; j <= a.length; j++) {
			int key= a[j];
			int i=j-1;
			while((i>0)&&(a[i]>key))
			{
				a[i+1]=a[i];
				i=i-1;
			}
			a[i+1]=key;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
	}

}
