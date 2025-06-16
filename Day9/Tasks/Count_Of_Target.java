package SD_Programs;

public class Count_Of_Target {
	public static int  lowerBound(int[] arr, int key) {
		int left=0;
		int right=arr.length;
		while(left<right) {
			int mid= left+(right-left)/2;
			if(arr[mid]<key) {
				left=mid+1;
				
			}else {
				right=mid;
			}
		}return left;
	}
	public static int  upperBound(int[] arr, int key) {
		int left=0;
		int right=arr.length;
		while(left<right) {
			int mid= left+(right-left)/2;
			if(arr[mid]<=key) {
				left=mid+1;
				
			}else {
				right=mid;
			}
		}return left;

}
	public static void main(String[]args) {
		int[] arr= {1, 21,21, 21, 21, 22, 34, 67};
		int target= 21;
		int count=upperBound(arr, target) -lowerBound(arr, target);
		System.out.println("Count Bound found at: " + count);
	}
}