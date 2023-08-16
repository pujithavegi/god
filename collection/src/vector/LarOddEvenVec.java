package vector;
import java.util.Vector;
import java.util.Scanner;
public class LarOddEvenVec {
	public static void main(String args[])
	{
		int n=0;
		Vector<Integer> v=new Vector<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n=sc.nextInt();
		 System.out.println("Enter the elements:");
		
		 for (Integer i = 0; i <= n; i++)
		 {
			 int element = sc.nextInt();
			 v.add(element);
	           
		 }
		 int largestOdd=0,largestEven=0;
		 for (Integer element : v) 
		 {
	            if (element % 2 != 0 && element > largestOdd) 
	            {
	                largestOdd = element;
	            }
	           
	      }
		 System.out.println("largest odd element" +largestOdd);
		 for (Integer element : v) 
		 {
	            if (element % 2 == 0 && element > largestEven) 
	            {
	                largestEven = element;
	            }
	      }
		 System.out.println("largest Even element" +largestEven);
				
	}

}
