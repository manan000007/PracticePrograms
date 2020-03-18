
public class InversionOfArray {

	public static void main(String[] args) {

		//finding how far is the array from being sorted
		int[] arr = { 2, 4, 1, 3, 5 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j])
					count++;
			}
		}

		System.out.println(count);
	}

}
