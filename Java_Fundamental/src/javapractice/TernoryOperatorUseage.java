package javapractice;
import java.util.*;
public class TernoryOperatorUseage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st number");
		int a=sc.nextInt();
		System.out.println("enter the 2nd number");
		int b=sc.nextInt();
		int res;
		res = (a > b) ? (a + b) : (b-a);
		System.out.println("the result of ternnory operator "+ res);

	}

}
