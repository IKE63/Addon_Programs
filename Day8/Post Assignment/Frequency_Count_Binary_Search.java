package DSA;

public class Frequency_Count_Binary_Search {
	 public static int lowerBound(int[] arr, int target) {
	        int left = 0, right = arr.length;
	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        return left;
	    }

	    public static int upperBound(int[] arr, int target) {
	        int left = 0, right = arr.length;
	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            if (arr[mid] <= target) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        return left;
	    }

	    public static int frequencyCount(int[] arr, int target) {
	        int lb = lowerBound(arr, target);
	        int ub = upperBound(arr, target);
	        return ub - lb;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 2, 2, 3, 4, 5, 5, 5, 5, 6, 7};
	        int target = 5;

	        int freq = frequencyCount(arr, target);
	        System.out.println("Frequency of " + target + " is: " + freq);
	    }
	

}
