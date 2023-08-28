package linkedList;

import java.util.*;

public class SearchAndReplaceElementLinkedList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elements");
		int n = sc.nextInt();
		System.out.println("enter the elements");
		LinkedList<Integer> ll = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			int element = sc.nextInt();
			ll.add(element);
		}
		System.out.println("enter the key to search");
		int target = sc.nextInt();
		Iterator<Integer> i = ll.iterator();
		boolean found = false;
		int index = 0;
		while (i.hasNext()) {
			int current = i.next();
			if (current == target) {
				found = true;
				break;
			}
			index++;
		}
		if (found) {
			System.out.println("Enter the replace element");
			int replace = sc.nextInt();
			ll.set(index, replace);
			System.out.println("Updated linked list:");
			for (int element : ll) {
				System.out.print(element + " ");
			}
		} else {
			System.out.println("element is not found in the linkedlist");
		}

	}

}
