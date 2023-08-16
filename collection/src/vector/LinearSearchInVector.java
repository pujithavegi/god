package vector;
import java.util.Vector;
import java.util.Scanner;
public class LinearSearchInVector {

	public static void main(String[] args) 
	{
		 int n = 0;
	        Vector<Integer> v = new Vector<Integer>();

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        n = sc.nextInt();
	        System.out.println("Enter the elements:");

	        for (int i = 0; i <= n; i++)
	        {
	            int element = sc.nextInt();
	            v.add(element);
	        }
	        System.out.print("Enter the element to search: ");
	        int target = sc.nextInt();
            int index = linearSearch(v, target);

	        if (index != -1) 
	        {
	            System.out.println("Element found at index: " + index);
	        } 
	        else 
	        {
	            System.out.println("Element not found in the vector.");
	      
	        }

    }
	public static int linearSearch(Vector<Integer> v, int target)
	{
	    for (int i = 0; i < v.size(); i++)
	    {
	        if (v.get(i) == target) 
	        {
	            return i; 
	        }
	    }
	    return -1; 
	}
}











