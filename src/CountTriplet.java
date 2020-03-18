import java.util.Arrays;

public class CountTriplet {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 3, 2 };
		System.out.println(countTriplets(arr));

	}

	public static int countTriplets(int[] arr) {

		int count=0;
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-2;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				int sum=arr[i]+arr[j];
				for(int k=j+1;k<arr.length;k++) {
					if(sum==arr[k]) {
						count++;
					}
				}
			}
		}
		if(count!=0) {
			return count;
		}
		else {
			return -1;
		}
	}

}
