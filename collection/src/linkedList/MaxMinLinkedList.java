package linkedList;

import java.util.*;

public class MaxMinLinkedList {

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
		int max = ll.get(0);
		int min = ll.get(0);

		// Iterate through the linked list to find max and min
		for (int element : ll) {
			if (element > max) {
				max = element;
			}
			if (element < min) {
				min = element;
			}
		}

		System.out.println("Maximum element: " + max);
		System.out.println("Minimum element: " + min);

	}

}
