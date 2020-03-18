
public class KandanesAlgorithm {

	public static void main(String[] args) {

		//it is used to find the maximum sum of contiguous subarray
		int arr[] = { 1, 2, 3, -2, 5 };
		int sum = 0;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
			if (sum > max) {
				max = sum;

			}
			if (sum <= 0) {
				sum = 0;
			}

		}
		System.out.println(max);
	}

}
