import java.util.Arrays;

public class DeleteElementUsingArray {
    public static void main(String[] args) {
        int[] array = new int[10];
    	array[0] = 1;
    	array[1] = 2;
    	array[2] = 3;
    	array[3] = 4;
    	array[4] = 5;
    	array[5] = 6;

    	int arrayLength = array.length;
    	int totalLength = 6;

    	System.out.println("array before deleting element is: ");
    	printArray(array, totalLength);

    	System.out.println("array after deleting element from end is: ");
    	int updatedLength1 = deleteEnd(array, totalLength);
    	printArray(array, updatedLength1);

    	int elementToBeDeletedFromIndex = 2;
    	System.out.println("array after deleting element from index " + elementToBeDeletedFromIndex + " is: ");
    	int updatedLength2 = deleteAtSpecificIndex(array, elementToBeDeletedFromIndex, updatedLength1);
    	printArray(array, updatedLength2);
    }

    public static int deleteEnd(int[] array, int totalElementlength) {
    	if (totalElementlength <= 0) {
    		System.out.println("Array is empty cannot delete element.");
    		return -1;
    	}

    	array[totalElementlength] = 0;
    	return (totalElementlength-1);
    }

    public static int deleteAtSpecificIndex(int[] array, int index, int totalElementLength) {
    	if (totalElementLength <= 0) {
    		System.out.println("Array is empty cannot delete element.");
    		return -1;
    	}

    	for (int i = index+1; i < totalElementLength; i++) {
    	    array[i-1] = array[i];
    	}
    	return (totalElementLength-1);
    }

    public static void printArray(int[] array, int totalElementLength) {
    	if (totalElementLength <= 0) {
    		System.out.println("Array is empty cannot print array.");
    		return;
    	}

    	for (int i = 0; i < totalElementLength; i++) {
    		System.out.print(array[i] +  " ");
    	}
    	System.out.println();
    }
}