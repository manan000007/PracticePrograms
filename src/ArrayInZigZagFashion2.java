
public class ArrayInZigZagFashion2 {

	public static void main(String[] args) {

		int arr[] = { 4, 3, 7, 8, 6, 2, 1 };
		zigzag(arr);
		for (int j : arr) {
			System.out.print(j + " ");
		}

	}

	public static int[] zigzag(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (i % 2 == 0) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			} else {
				if (arr[i] < arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		return arr;
	}

}
