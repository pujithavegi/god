package vector;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Scanner;
public class SumOfPosNegVec {

	public static void main(String[] args) {
		int n=0;
		Vector<Integer> v=new Vector<Integer>();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n=sc.nextInt();
		 System.out.println("Enter the elements:");
		
		 for (Integer i = 0; i <= n; i++)
		 {
			 int element = sc.nextInt();
			 v.add(element);
	           
		 }
		 int psum=0,nsum=0;
			
			for (int n1:v) 
			{
			    if (n1 > 0)
			    {
			        psum += n1;
			    } else if (n1 < 0) 
			    {
			        nsum += n1;
			    }
			}
			System.out.println("sum of positive integer" +psum);
			System.out.println("sum of positive integer" +nsum);
		
		

	}

}
