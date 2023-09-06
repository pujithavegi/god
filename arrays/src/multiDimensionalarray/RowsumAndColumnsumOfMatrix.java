package multiDimensionalarray;
import java.util.*;
public class RowsumAndColumnsumOfMatrix {

	public static void main(String[] args) {
		int rSum=0;
		int cSum=0;
		int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++) {
			rSum+=matrix[i][j];
			
		}
	}
	System.out.println(rSum);
	}

}
