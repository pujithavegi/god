package divisiblebym;
import java.util.Scanner;
public class Divisiblebym {

	public static void main(String[] args) {
		int m,n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		n=sc.nextInt();
		System.out.println("enter m");
		m=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%m==0)
			{
				System.out.println(i);
			}
		}

	}

}
