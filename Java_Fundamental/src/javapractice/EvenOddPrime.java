package javapractice;

import java.util.Scanner;

public class EvenOddPrime {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		n = sc.nextInt();
		EvenOddPrime instance = new EvenOddPrime();

		int isEven =instance.isEven(n);
		boolean isPrime = instance.isPrime(n);
		 if (instance.isPrime(n)) {
	            System.out.println(n + " is prime.");
	        } else {
	            System.out.println(n + " is not prime.");
	        }
	
	}

	int isEven(int n) {
		if (n % 2 == 0) {
			System.out.println(n + "is even");
		} else {
			System.out.println(n + "is odd");
		}
		return n;
	}

	boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
