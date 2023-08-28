package linkedList;
import java.util.*;
public class SearchElementLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=sc.nextInt();
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			int element=sc.nextInt();
			ll.add(element);
		}
		Iterator<Integer> i=ll.iterator();
		while(i.hasNext())
		{
			  System.out.println(i.next()); //It is used for printing the elements available in linkedlist
			  
		}
		System.out.println("enter the element to be search");
		int target=sc.nextInt();
		i=ll.iterator();
		 boolean found = false;
		while (i.hasNext())
		{
            int current = i.next();
            if (current == target) 
            {
                found=true;
                break;
                
           
            }
        }
		if(found)
		{
			System.out.println("element is found");
		}
		else
		{
			System.out.println("element is not found in the linkedlist");
		}
		

	}

}
