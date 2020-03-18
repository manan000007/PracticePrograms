
public class PrintLeadersInArray {
	// i.e an element is greater than the elements to its right side
	public static void main(String[] args) {

		boolean b;
		int[] arr = { 7, 4, 5, 7, 3 };
		for (int i = 0; i < arr.length - 1; i++) {
			b = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] <= arr[j]) {
					b = true;
					break;
				}
			}
			if (!b) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print(arr[arr.length - 1]);
		System.out.println();
	}
}
