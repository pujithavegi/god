package vector;
import java.util.Vector;
import java.util.Scanner;
public class InsertAndDeleteElementFromVector {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<> ();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		System.out.println(v);//[10,20,30,40]
		v.remove(3);//removing the specific index element from vector
		System.out.println(v);//[10,20,30]
		v.add(3,40);//Inserts the specified element at the specified position in this Vector.
		System.out.println(v);//[10,20,30,40]
		v.addElement(50);//Adds the specified component to the end of this vector, increasing its size by one.
		System.out.println(v);//[10,20,30,40,50]
		v.remove(1);//Removes the element at the specified position in this Vector.
		System.out.println(v);//[10,30,40,50]
		v.removeAllElements();//Removes all components from this vector and sets its size to zero.		
		System.out.println(v);//[]
	}

}
