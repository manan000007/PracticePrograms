import java.util.Arrays;

public class KthSmallestElementInArray {

	public static void main(String[] args) {

		int[] arr= {7,10,4,3,20,15};
		int k=3;
		Arrays.sort(arr);
		
		System.out.println("kth smallest element is :" +arr[k-1]);
	}

}
