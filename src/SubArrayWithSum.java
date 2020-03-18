import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubArrayWithSum {

	public static void main(String[] args) {
		int[] arr = { 3, 4, -7, 1, 3, 3, 1, -4 };
		int sum = 7;

		findSubarrays(arr, sum);
	}

	private static void findSubarrays(int[] arr, int sum) {

		for (int i = 0; i < arr.length; i++) {
			int sum_of_array = 0;

			for (int j = i; j < arr.length; j++) {
				sum_of_array += arr[j];

				if (sum_of_array == sum) {

					System.out.println(IntStream.range(i, j+1 )
							.mapToObj(k -> arr[k]).collect(Collectors.toList()));

				}

			}
		}
	}

}
