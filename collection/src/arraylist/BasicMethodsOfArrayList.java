package arraylist;

import java.util.ArrayList;
import java.util.List;

public class BasicMethodsOfArrayList {

	public static void main(String[] args) {
		List aList = new ArrayList();
		aList.add(100);
		aList.add(200);
		aList.add(300);
		aList.add(400);
		System.out.println("aList =" + aList);// [100,200,300,400]
		aList.add(0, 50);
		System.out.println("aList =" + aList);// [50,100,200,300,400]
		aList.set(0, 500);
		System.out.println("aList =" + aList);// [500,100,200,300,400]
		System.out.println("Does it contains 700" + aList.contains(700));// false
		System.out.println("Printing first element" + aList.get(0));// 500
		aList.add(100);// [500,100,200,300,400,100]
		System.out.println(aList.indexOf(100));// 1
		System.out.println(aList.lastIndexOf(100));// 5
		System.out.println(aList.indexOf(101));// -1
		aList.remove(5);
		System.out.println("Final aList before retainall" + aList);// [500,100,200,300,400]
		List bList = new ArrayList();
		bList.add(100);
		bList.add(200);
		bList.add(1000);
		bList.addAll(aList);
		System.out.println("Final bList before retainall" + bList);// [100,200,1000,500,100,200,300,400]
		bList.retainAll(aList);
		System.out.println("Final Result after retainall" + bList);
		

	}

}
