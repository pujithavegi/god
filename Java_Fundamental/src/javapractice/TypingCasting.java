package javapractice;
import java.util.Scanner;
public class TypingCasting {
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter integer value");
	   int n=sc.nextInt();
	   System.out.println("widening  type casting from integer to float"); 
	   float a=n;
	   System.out.println(a);
	   System.out.println("narrowing type casting from double to integer");
	   double c=a;
	   int d=(int)c;
	   System.out.println(d);
	   
	}
	

}
