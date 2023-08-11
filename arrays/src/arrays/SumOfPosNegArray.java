package arrays;
import java.util.Scanner;
public class SumOfPosNegArray {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("no of elements");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int psum=0,nsum=0;
		
		for (int n1:arr) 
		{
		    if (n1 > 0)
		    {
		        psum += n1;
		    } else if (n1 < 0) 
		    {
		        nsum += n1;
		    }
		}

	        
	        System.out.println("Sum of positive elements: " + psum);
	        System.out.println("Sum of negative elements: " + nsum);



	}

}
