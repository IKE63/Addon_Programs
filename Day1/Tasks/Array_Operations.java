package SD_Programs;

public class Array_Operations {

	    public static void main(String[] args) {
	        int[] arr = new int[10];
	        int size = 5;

	        arr[0] = 10;
	        arr[1] = 20;
	        arr[2] = 30;
	        arr[3] = 40;
	        arr[4] = 50;

	        System.out.print("Original array: ");
	        printArray(arr, size);

	        int insertIndex = 2;
	        int insertValue = 25;
	        for (int i = size; i > insertIndex; i--) {
	            arr[i] = arr[i - 1];
	        }
	        arr[insertIndex] = insertValue;
	        size++;

	        System.out.print("After insertion: ");
	        printArray(arr, size);

	        int deleteIndex = 3;
	        for (int i = deleteIndex; i < size - 1; i++) {
	            arr[i] = arr[i + 1];
	        }
	        size--;

	        System.out.print("After deletion: ");
	        printArray(arr, size);

	        arr[1] = 99;

	        System.out.print("After update: ");
	        printArray(arr, size);
	    }

	    public static void printArray(int[] arr, int size) {
	        for (int i = 0; i < size; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	}


