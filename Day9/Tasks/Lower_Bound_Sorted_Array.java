package DSA;

import java.util.Scanner;

public class Lower_Bound_Sorted_Array {
	public static void main(String[] args) {
		int[] arr= {2,3,4,5,12,25,35,77};
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the target:");
		int target=s.nextInt();
	
		 int left=0;
		 int right=arr.length;
		 int mid;
		 
		 
		while(left<right) {
			mid=(left+right)/2;
		
			if(arr[mid]<target) {
				left=mid+1;
			}
			else if(arr[mid]>=target) {
				right=mid;
			}
			if(left==right) {
				System.out.println("Low bound found at index: " + left + " and value: " + arr[left]);
			}
		}
	}

}
