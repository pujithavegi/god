package series;
import java.util.Scanner;
public class Series {

	public static void main(String[] args) {
		int a=2,b=9,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		n=sc.nextInt();
		double sum=a/b;
		for(int i=1;i<=n;i++)
		{
			a=a+3;
			b=b+4;
			if(i%2==0)
			{
				sum =sum+(a/b);
			}
			else
			{
				sum =sum-(a/b);
			}
		}
		System.out.println(sum);
			

	}

}
