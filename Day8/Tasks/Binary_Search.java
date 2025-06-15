package SD_Programs;

public class Binary_Search {
	 public static int binarySearch(int[] arr, int left, int right, int key) {
	        if (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == key)
	                return mid;
	            else if (arr[mid] > key)
	                return binarySearch(arr, left, mid - 1, key);
	            else
	                return binarySearch(arr, mid + 1, right, key);
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        int[] arr = {3, 10, 15, 20, 35, 50}; // Sorted array
	        int key = 20;

	        int index = binarySearch(arr, 0, arr.length - 1, key);

	        if (index != -1)
	            System.out.println("Element " + key + " found at index: " + index);
	        else
	            System.out.println("Element " + key + " not found in the array.");
	    }

}
