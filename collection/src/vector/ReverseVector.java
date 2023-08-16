package vector;
import java.util.Vector;
import java.util.Scanner;
public class ReverseVector {
	public static void main (String args[])
	{
		int n=0;
		Vector<Integer> v=new Vector<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements");
		n=sc.nextInt();
		System.out.println("enter the elements");
		for(int i=0;i<=n;i++) 
		{
			int element=sc.nextInt();
			v.add(element);
		}
		for(int i=v.size()-1;i>=0;i--)
		{
			System.out.println(v.get(i));
		}
		
		
	}

}
