package sequence;
import java.util.Scanner;
public class Sequence {

	public static void main(String[] args) {
		int n,i;
		double sum=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		for(i=0;i<n;i++)
		{
			int f=1;
			for(int j=1;j<=i;j++)
			{
				f *=j;
			}
			int t=1/f;
			sum=sum+t;
		}
       System.out.println(sum);
	}

}
