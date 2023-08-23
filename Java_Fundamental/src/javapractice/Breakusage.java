package javapractice;
import java.util.*;
public class Breakusage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number how many times it should be iterate");
		int n=sc.nextInt();
		System.out.println("enter the number to break the statement");
		int target=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			if(i==target)
			{
				break;
			}
			System.out.println(i);
		}

	}

}