package SD_Programs;

public class Rank_Finder {
	public static int upperBound(int[] arr, int key) {
		int left=0;
		int right=arr.length;
		while(left<right) {
			int mid=left+(right-left)/2;
			if(arr[mid]<=key) {
				left=mid+1;
				
			}else {
				right=mid;
			}
		}return left;
	}
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80};
		int target=70;
		
		int rank=upperBound(arr, target);
		System.out.println("Rank of: " + target + " is " + rank);
	}

}
