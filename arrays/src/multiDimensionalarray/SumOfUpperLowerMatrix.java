package multiDimensionalarray;
import java.util.*;
public class SumOfUpperLowerMatrix {

	public static void main(String[] args) {
		int uSum=0;
		int lSum=0;
	   int matrix[][]= {{1,2,3},{2,3,4},{3,4,5}};
	   System.out.println("print sum of lower matrix");
	   for(int i=0;i<3;i++)
	   {
		   for(int j=0;j<3;j++)
		   {
			   if(i<j)
			   {
				   lSum +=matrix[i][j];
			   }
		   }
	   }
	   System.out.println(lSum);
	   System.out.println("print sum of upper matrix");
	   for(int i=0;i<3;i++)
	   {
		   for(int j=0;j<3;j++)
		   {
			   if(i>j)
			   {
				   uSum +=matrix[i][j];
			   }
		   }
	   }
	   System.out.println(uSum);

	}

}
