package DSA;
import java.util.Scanner;
public class Input_Type_Detection {

	 public static int search(int[] arr, int target) {
	    int left = 0, right = arr.length - 1;
	        while (left <= right) {
	     int mid = left + (right - left) / 2;
	          if (arr[mid] == target) return mid;
	            if (arr[left] <= arr[mid]) {
	                if (target >= arr[left] && target < arr[mid]) right = mid - 1;
	              else left = mid + 1;
	            } else {
	                if (target > arr[mid] && target <= arr[right]) left = mid + 1;
	               else right = mid - 1;
	            }
	        }
       return -1;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);	        
	        System.out.println("Enter integers of rotated sorted array separated by spaces:");
	        String[] input = scanner.nextLine().split(" ");
	        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {	           
        	arr[i] = Integer.parseInt(input[i]);
	        }
	        System.out.println("Enter target:");	        
	        
	        int target = scanner.nextInt();
	        scanner.close();

	        int index = search(arr, target);
	        if (index != -1) {
	            System.out.println("Target found at index: " + index);
	        } else {
	            System.out.println("Target not found.");
	        }
	    }
	}


