import java.lang.Math;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {9, 2, 8, 3, 7, 6, 6, 1, 5, 4, 6};
        int n = arr.length;
        int k = 2;

        int max1 = fixedSizeSlidingWindow(arr, n, k);
        System.out.println(max1);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int fixedSizeSlidingWindow(int[] array, int arrSize, int windowSize) {
    	int maxSum = 0;
    	int windowSum = 0;
    	int left = 0;

    	for (int right = 0; right < arrSize; right++) {
    		windowSum += array[right];

    		if (windowSum > maxSum) {
    			maxSum = windowSum;
    		}

    		if (right >= windowSize-1) {
    			windowSum -= array[left];
    			left++;
    		}
    	}
    	return maxSum;
    }
}