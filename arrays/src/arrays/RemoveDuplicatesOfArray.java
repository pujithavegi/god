package arrays;
import java.util.Arrays;

public class RemoveDuplicatesOfArray {
    public static void main(String[] args) {
        int[] originalArray = { 2, 4, 6, 8, 4, 10, 2, 12, 14, 6 };

        int[] newArray = removeDuplicates(originalArray);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Array with Duplicates Removed: " + Arrays.toString(newArray));
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        if (n <= 1) {
            return array;
        }

        int newSize = n;
        for (int i = 0; i < newSize; i++) {
            for (int j = i + 1; j < newSize; j++) {
                if (array[i] == array[j]) {
                    array[j] = array[newSize - 1];
                    newSize--;
                    j--;
                }
            }
        }
        int[] newArray = Arrays.copyOf(array, newSize);
        return newArray;
    }
}
