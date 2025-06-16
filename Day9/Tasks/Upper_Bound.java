package SD_Programs;

public class Upper_Bound {
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
		}
		return left;
		
	} 	
	public static void main(String[] args) {
		int[] arr= {2,3,4,5,6,7,8,10,12};
		int key=5;
		
		int ubIndex=upperBound(arr, key);
		if(ubIndex<arr.length) {
			System.out.println("Upper Bound found at index: " + ubIndex + " and value is: " + arr[ubIndex]);
			
		}else {
			System.out.println("Upper bound not found");
		}
	}

}
