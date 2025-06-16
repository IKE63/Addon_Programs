package DSA;

public class Rotated_Search_Array {

	    public static int search(int[] arr, int target) {
	        int left = 0, right = arr.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {
	                return mid;
	            }

	            if (arr[left] <= arr[mid]) {
	                if (arr[left] <= target && target < arr[mid]) {
	                    right = mid - 1;
	                } else {
	                    left = mid + 1;
	                }
	            } else {
	                if (arr[mid] < target && target <= arr[right]) {
	                    left = mid + 1;
	                } else {
	                    right = mid - 1;
	                }
	            }
	        }

	        return -1;
	    }

	    public static void main(String[] args) {
	        int[] arr = {4, 5, 6, 7, 0, 1, 2};
	        int target = 0;

	        int index = search(arr, target);
	        if (index != -1) {
	            System.out.println("Target " + target + " found at index: " + index);
	        } else {
	            System.out.println("Target " + target + " not found in the array.");
	        }
	    }
	}


