package stack;
import java.util.*;
import java.util.Stack;
public class BasicStackOperations {

	public static void main(String[] args) {
		
		Stack st=new Stack();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of element ");
	int n=sc.nextInt();
	System.out.println("enter the elements");
	for(int i=0;i<n;i++)
	{
		int element=sc.nextInt();
		st.push(element);
		
	}
	while(!st.isEmpty())
	{
         System.out.println(st.pop());
	}
	}
	

}
