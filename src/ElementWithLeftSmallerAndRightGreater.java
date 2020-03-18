
public class ElementWithLeftSmallerAndRightGreater {

	public static int smallerGreater() {

		int arr[] = { 4, 2, 5, 7 };
		int[] leftMax = new int[arr.length], rightMin = new int[arr.length];
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
			leftMax[i] = max;
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			min = Math.min(min, arr[i]);
			rightMin[i] = min;
		}

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] >= leftMax[i] && arr[i] <= rightMin[i])
				return arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(smallerGreater());
	}

}
