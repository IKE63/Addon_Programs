package SD_Programs;

public class Bubble_Sort {
	public static void main (String[] args) {
		int[] arr= {58,12,45,32,18};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length -1 -i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		System.out.println("Sortedd Arrays:");
		for (int num: arr) {
			System.out.print(num + " ");
		}
	}

}


