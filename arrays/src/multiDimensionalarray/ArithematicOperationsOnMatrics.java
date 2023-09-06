package multiDimensionalarray;
import java.util.*;
public class ArithematicOperationsOnMatrics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no rows");
		int  rows=sc.nextInt();
		System.out.println("enter no columns");
		int  columns=sc.nextInt();
		int matrix1[][]=new int[rows][columns];
        int matrix2[][]=new int[rows][columns];
        System.out.println("enter the matrix elements");
        for(int i=0;i<rows;i++)
        {
        	for(int j=0;j<columns;j++)
        	{
        		System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix1[i][j] = sc.nextInt();
        	}
        }
        for(int i=0;i<rows;i++)
        {
        	for(int j=0;j<columns;j++)
        	{
        		System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix2[i][j] = sc.nextInt();
        	}
        }
        int result[][]=new int[rows][columns];
        System.out.println("print the addition of two matrics");
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<columns;j++)
        	{
        		result[i][j]=matrix1[i][j]+matrix2[i][j];
        		System.out.print(result[i][j]+" ");
        	}
        	System.out.println();
        }
        System.out.println("print the subtraction of two matrics");
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<columns;j++)
        	{
        		result[i][j]=matrix1[i][j]- matrix2[i][j];
        		System.out.print(result[i][j]+" ");
        	}
        	System.out.println();
        }
        System.out.println("print the multiplication of two matrics");
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<columns;j++)
        	{
        		for(int k=0;k<rows;k++)
        		{
        		result[i][j]=matrix1[i][k]* matrix2[k][j];
        		}
        		System.out.print(result[i][j]+" ");
        	}
        	System.out.println();
        }
        
	}

	
}
