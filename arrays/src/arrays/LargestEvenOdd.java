package arrays;
import java.util.Integer;
import java.util.Scanner;
public class LargestEvenOdd {
    public static void main(String args[])
    {
    	  Scanner scanner = new Scanner(System.in);

          System.out.print("Enter the no of elements ");
          int n = scanner.nextInt();

          int[] inputs = new int[n];
          System.out.print("enter the elements");
          for (int i = 0; i < n; i++)
          {
              inputs[i] = scanner.nextInt();
          }

          int largestEven = Integer.MIN_VALUE;
          int largestOdd = Integer.MIN_VALUE;

          for (int num : inputs) {
              if (num % 2 == 0 && num > largestEven) {
                  largestEven = num;
              } else if (num % 2 != 0 && num > largestOdd) {
                  largestOdd = num;
              }
          }

          if (largestEven == Integer.MIN_VALUE) {
              System.out.println("No even integers entered.");
          } else {
              System.out.println("Largest Even Integer: " + largestEven);
          }

          if (largestOdd == Integer.MIN_VALUE) {
              System.out.println("No odd integers entered.");
          } else {
              System.out.println("Largest Odd Integer: " + largestOdd);
          }
    }
}
