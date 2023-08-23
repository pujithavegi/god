package arrays;
import java.util.Scanner;
public class SmallestLargestDifference {

	public static void main(String[] args) {
   
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of elements in array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements");
    for(int i=0;i<n;i++)
    {
    	arr[i]= sc.nextInt();
    }
    int largest = largestElement(arr);
    int smallest = smallestElement(arr);
        int difference = largest - smallest;
    System.out.println("Largest Element: " + largest);
    System.out.println("Smallest Element: " + smallest);
    System.out.println("Difference: " + difference);

	}
	public static int largestElement(int arr[])
	{
		int max=arr[0];
		 for (int i = 0; i < arr.length; i++) 
		 {   
	           if(arr[i] > max)
	           {
	               max = arr[i]; 
	           }
	        }  
		 return max;
	}
	public static int smallestElement(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]< min)
			{
				min=arr[i];
			}
		}
		return min;
	}

}
