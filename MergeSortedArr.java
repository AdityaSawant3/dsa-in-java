import java.util.Arrays;
public class MergeSortedArr {
	public static void main(String[] args){
		int[] arr1 = {1, 4, 6, 8};
		int[] arr2 = {3, 5, 7, 9};
		Merge m = new Merge();
		int[] result = m.merged(arr1, arr2);
		System.out.println(Arrays.toString(result));
	}
}

class Merge {

	public int[] merged(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];

		// Pointers
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				result[k] = arr1[i];
				i++;
			} else {
				result[k] = arr2[j];
				j++;
			}
			k++;
		}

		while (i < arr1.length) {
			result[k] = arr1[i];
			i++;
			k++;
		}

		while (j < arr2.length) {
			result[k] = arr2[j];
			j++;
			k++;
		}

		return result;

	}

}