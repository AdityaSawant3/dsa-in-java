import java.util.Arrays;

public class SortArrayExceptOne {
    public static void main(String[] args) {
        int[] array = {9, 2, 8, 3, 7, 5, 6, 4};
        System.out.println("Array before sorting: " + Arrays.toString(array));

        int indexNotToBeSorted = 4;
        sortArray(array, indexNotToBeSorted);
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }

    public static void sortArray(int[] array, int k) {
        int n = array.length;

    	int temp = array[k];
        array[k] = array[n-1];
        array[n-1] = temp;

        Arrays.sort(array, 0, n-1);

        int lastElement = array[n-1];

        for (int i = n-1; i > k; i--) {
            array[i] = array[i-1];
            
        }
        array[k] = lastElement;
    }

}