import java.util.Arrays;

public class BubbleSortClass {
	public static void main(String[] args) {
		int[] unSortedArr = {6, 2, 1, 7, 10, 9};
		System.out.println("Before sorting array: " + Arrays.toString(unSortedArr));
		BubbleSortImplementation s = new BubbleSortImplementation();
		int[] sortedArr = s.sort(unSortedArr);
		System.out.println("After sorting array: " + Arrays.toString(sortedArr));
	}
}

// Time Complexity: O(n^2)
// Space Complexity: O(1)
class BubbleSortImplementation {
	public int[] sort(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-i-1; j++) {
				System.out.println(j);
				if (array[j] > array[j+1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}