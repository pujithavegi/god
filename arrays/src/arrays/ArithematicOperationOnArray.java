package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArithematicOperationOnArray {

	public static void main(String[] args) {
		int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements in array");
		n=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		System.out.println("Enter elements for array 1:");
        for (int i = 0; i < n; i++) 
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements for array 2:");
        for (int i = 0; i < n; i++)
        {
            arr2[i] = sc.nextInt();
        }
        int[] sum = new int[n];
        int[] difference = new int[n];
        int[] product = new int[n];
        double[] division = new double[n];
        for (int i = 0; i < n; i++) 
        {
            sum[i] = arr1[i] + arr2[i];
            difference[i] = arr1[i] - arr2[i];
            product[i] = arr1[i] * arr2[i];

            if (arr2[i] != 0)
            {
                division[i] = (double) arr1[i] / arr2[i];
            } 
            else 
            {
                System.out.println("Division by zero!");
            }
            
           
        }
        
        System.out.println("Sum: " + Arrays.toString(sum));
        System.out.println("Difference: " + Arrays.toString(difference));
        System.out.println("Product: " + Arrays.toString(product));
        System.out.println("Quotient: " + Arrays.toString(division));
	}

}
