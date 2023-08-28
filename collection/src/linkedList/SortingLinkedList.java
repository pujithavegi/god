package linkedList;

import java.util.*;

public class SortingLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n = sc.nextInt();
		System.out.println("enter the elements");
		for (int i = 0; i < n; i++) {
			int element = sc.nextInt();
			ll.add(element);
		}
		Collections.sort(ll);

		System.out.println("Sorted linked list:");
		for (int element : ll) {
			System.out.print(element + " ");
		}

	}
	

}
