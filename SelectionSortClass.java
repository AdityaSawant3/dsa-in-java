import java.util.Arrays;

public class SelectionSortClass {
	public static void main(String[] args) {
		int[] unSortedArr = {6, 2, 1, 7, 10, 9};
		System.out.println("Before sorting array: " + Arrays.toString(unSortedArr));
		SelectionSortImplementation s = new SelectionSortImplementation();
		int[] sortedArr = s.sort(unSortedArr);
		System.out.println("After sorting array: " + Arrays.toString(sortedArr));
	}
}

// Time Complexity O(n*n)
// Space Complecity O(1)
class SelectionSortImplementation {
	public int[] sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
		return array;
	}
}