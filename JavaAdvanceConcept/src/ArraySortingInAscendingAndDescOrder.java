import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class ArraySortingInAscendingAndDescOrder {
	

	public static void main(String[] args) {
//		int[] array = { 4, 2, 9, 7, 3, 1, 6, 8 };
//		int n = array.length;
//		Arrays.sort(array);
//		
//		
//		for(int i=0;i<n/2;i++)
//		{
//			System.out.print(array[i]+ " ");
//		}
//			
//			for(int j=n-1;j>=n/2;j--)
//			{
//				System.out.print(array[j] + " ");
//			}
//		}
		
		
		// -------------------------------- Output is [2, 4, 7, 9, 8, 6, 3, 1]---------------------------------------------
//		Integer[] array = { 4, 2, 9, 7, 3, 1, 6, 8 };
//     	int n = array.length;
//     	Arrays.sort(array, 0, n/2);
//     	Arrays.sort(array, n/2, n,Collections.reverseOrder());
//     	System.out.println(Arrays.toString(array));
		
		//---------------------Input array is {4,1,05} output array is {5,1,0,4}
//		int [] arr= {4,1,0,5};
//		int n = arr.length;
//		for(int i=0;i<n;i++)
//		{
//			if((arr[i] & 1) !=0)
//			{
//				arr[i]*=-1;
//			}
//		}
//		Arrays.sort(arr);
//		for(int i=0;i<n;i++)
//		{
//			if((arr[i] & 1) !=0)
//			{
//				arr[i]*=-1;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//
//     	

////////////////---------------------------hi----------------------------------------
//		TreeSet<StringBuffer> t=new TreeSet<StringBuffer>(new MyComporator());
//		t.add(new StringBuffer("A"));
//		t.add(new StringBuffer("Z"));
//		t.add(new StringBuffer("K"));
//		t.add(new StringBuffer("L"));
//		System.out.println(t);
		
		// pattern 10
		// 1
		// 2 7
		// 3 8 13
		// 4 9 14 19
		// 5 10 15 20 25
	
		
//		for(int i=1;i<=5;i++)
//		{
//			int num=i;
//			
//			for(int j=1;j<=i;j++)			
//			{
//			System.out.print(num);
//		
//			num+=5;
//			}
//			System.out.println();
//		}
		
		// pattern 10
				// 1
				// 1 2 1
				// 1 2 3 2 1
				// 1 2 3 4 3 2 1
				// 1 2 3 4 5 4 3 2 1
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i-1;k>0;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
			

}
}



