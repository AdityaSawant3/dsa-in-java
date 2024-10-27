import java.util.Arrays;

public class InsertElementUsingArray {
    public static void main(String[] args) {
    	int[] array = new int[10];
    	array[0] = 1;
    	array[1] = 2;
    	array[2] = 3;
    	array[3] = 4;
    	array[4] = 5;
    	array[5] = 6;

    	int totalElements = 6;
    	System.out.println("Elements of array before inserting is: ");
    	printArray(array, totalElements);

    	// Insert at end.
    	int elementToBeInserted1 = 7;
    	int updatedTotalElementIndex1 = insertAtEnd(array, elementToBeInserted1, totalElements);
        System.out.println("Elements of array after inserting at end is: ");
    	printArray(array, updatedTotalElementIndex1);

    	// Insert at specific index.
    	int elementToBeInserted2 = 12;
    	int insertAtIndex = 3;
    	int updatedTotalElementIndex2 = insertAtSpecificPosition(array, elementToBeInserted2, insertAtIndex, updatedTotalElementIndex1);
        System.out.println("Elements of array after inserting at index " + insertAtIndex + " is: ");
    	printArray(array, updatedTotalElementIndex2);
    }

    public static int insertAtEnd(int[] array, int element, int totalElementsLength) {
    	if (totalElementsLength >= array.length) {
    		System.out.println("Cannot insert at end, because capacity is full.");
    		return -1;
    	}
    	array[totalElementsLength] = element;
    	return (totalElementsLength+1);
    }

    public static int insertAtSpecificPosition(int[] array, int element, int index, int totalElementsLength) {
    	if (totalElementsLength >= array.length) {
    		System.out.println("Cannot insert at " + index + ", because capacity is full.");
    		return -1;
    	}

    	for (int i = totalElementsLength-1; i >= index; i--) {
    		array[i+1] = array[i];
    	}
    	array[index] = element;

    	return (totalElementsLength+1);
    }

    public static void printArray(int[] array, int totalElements) {
    	for (int i = 0; i < totalElements; i++) {
    		System.out.print(array[i] + " ");
    	}
    	System.out.println();
    }
}