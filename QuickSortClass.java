public class QuickSortClass {

    public static void main(String[] args) {

        int[] array = {8, 3, 1, 6, 7, 2, 6, 4, 5};
        quickSort(array, 0, array.length-1);
        for (int i : array) {
        	System.out.print(i + " ");
        }

	}

	// Time Complexity:
	// 1. Best Case: O(n(log(n)))
	// 2. Average Case: O(n(log(n)))
	// 3. Worst Case: O(n^2) if already sorted.
	public static void quickSort(int[] array, int start, int end) {
		if (start >= end) {
			return;
		}

		int pivot = partition(array, start, end);
		quickSort(array, start, pivot-1);
		quickSort(array, pivot+1, end);

	}

	public static int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int i = start-1;

		for (int j = start; j < end; j++) {
			if (array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		i++;
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;

		return i;
	}
}
