package linkedList;
import java.util.Scanner;
import java.util.LinkedList;
public class BasicMethodsOnLinkedList {

	public static void main(String[] args) {
		int n;
      LinkedList l=new LinkedList();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the no of elemenets");
      n=sc.nextInt();
      System.out.println("enter the elements");
      for(int i=0;i<n;i++)
      {
    	  int element=sc.nextInt();
    	  l.add(element);
    	  
      }
      System.out.println(l);
      l.add(10);
      System.out.println(l);
      l.removeLast();//It removes and returns the last element from a list.
      System.out.println(l);
      l.removeFirst();//It removes and returns the first element from a list.
      System.out.println(l);
	}

}
