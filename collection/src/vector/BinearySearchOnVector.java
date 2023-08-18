package vector;
import java.util.Vector;
import java.util.Scanner;
import java.util.Collections;
public class BinearySearchOnVector {

	public static void main(String[] args) {
		int n;
		Vector<Integer> v=new Vector<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements");
		n=sc.nextInt();
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			int element=sc.nextInt();
			v.add(element);
		}
		System.out.print("Enter the element to search: ");
        int target = sc.nextInt();
       
        int index = binarySearch(v, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
		

	}
	public static int binarySearch(Vector<Integer> v,int target)
	{
		Collections.sort(v);
		System.out.println("after sorting vector"+ v);
		int start = 0;
        int end = v.size() - 1;
        while(start<=end) {
        int mid = start + (end - start) / 2;

            if (v.get(mid) == target) {
                return mid;
            }
            
            if (v.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
		return -1;
	 
    
	}
}
