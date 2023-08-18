package vector;
import java.util.Vector;
import java.util.Scanner;
public class MeanMedianOnVector {
	public static void main(String args[])
	{
		int n=0;
		Vector<Integer> v = new Vector<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n=sc.nextInt();
		 System.out.println("Enter the elements:");
		
		 for (Integer i = 0; i < n; i++)
		 {
			 int element = sc.nextInt();
			 v.add(element);
	           
		 }
		System.out.println("The elements in the vector are " + v);
		int me = mean(v);
	        System.out.println("Mean: " + me);
	        int medi = median(v);
	        System.out.println("Median: " + medi);
	}
	public static int mean(Vector<Integer> v)
	{
		int sum=0;
		for(int element:v)
		{
			sum+=element;
		}
		
		return sum/v.size();
		
	}
	public static int median(Vector<Integer> v)
	{
		int ele1,ele2,med=0;
		if(v.size()%2==0)
		{
			ele1=v.get(v.size()/2);
			ele2=v.get(ele1+1);
			med=(ele1+ele2)/2;
		}
		else {
			med=v.get((v.size()-1)/2);
		}
		return med;
	}

}
