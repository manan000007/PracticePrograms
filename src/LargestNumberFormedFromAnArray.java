
public class LargestNumberFormedFromAnArray {

	public static void main(String[] args) {

		int arr[] = { 3, 30, 34, 5, 9 };

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (((arr[j] + "") + (arr[i] + "")).compareTo((arr[i] + "") + (arr[j] + "")) > 0)

				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
