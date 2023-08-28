package arrays;

import java.util.Scanner;

public class RotateArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) 
		{
			int j, first;

			first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {

				arr[j] = arr[j + 1];
			}
			arr[j] = first;
		}
		System.out.println("Array after left rotation: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
