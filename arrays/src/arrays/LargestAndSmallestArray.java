package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class LargestAndSmallestArray {

	public static void main(String[] args) {
	 Scanner sc=new	 Scanner(System.in);
	 System.out.println("enter the no of elements");
	 int n=sc.nextInt();
	 int arr[]=new int[n];
	 System.out.println("enter the elements");
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 if(arr.length<2)
	 {
		 System.out.println("inster elements more then 2 elements");
	 }
	 int firstmax=firstLargestelement(arr);
	 int firstmin=firstSmallestelement(arr);
	 System.out.println("1st largest" +firstmax);
	 System.out.println("1st smallest" +firstmin);
	 Arrays.sort(arr);
	 int secondmin= arr[1];
	 System.out.println("2nd min"+ secondmin );
	 int s=arr.length-2;
	 int secondmax= arr[s]; 
	 System.out.println("2nd min"+ secondmax );
	}		 
	public static int firstLargestelement(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static int firstSmallestelement(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	

}
