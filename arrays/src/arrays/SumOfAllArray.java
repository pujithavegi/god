package arrays;
import java.util.Scanner;
public class SumOfAllArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
	    int [] arr = new int [n] ;
	    for(int i=0;i<n;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
        int sum = 0;  
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of all the elements of an array: " + sum);  
    }  
  
}


