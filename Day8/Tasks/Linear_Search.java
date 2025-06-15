package SD_Programs;

public class Linear_Search {
	 public static int linearSearch(int[] arr, int key) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key)
	                return i; 
	        }
	        return -1; // not found
	    }

	    public static void main(String[] args) {
	        int[] arr = {12, 34, 7, 9, 56, 21}; 
	        int key = 9;

	        int index = linearSearch(arr, key);

	        if (index != -1) {
	            System.out.println("Element " + key + " found at index: " + index);
	        } else {
	            System.out.println("Element " + key + " not found in the array.");
	        }
	    }

}
