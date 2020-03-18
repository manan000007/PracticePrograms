
public class MergeTwoSortedArrays {

	public static void main(String[] args) {

		int[] arr1 = { 11, 34, 66, 75 };
		int n1 = arr1.length;

		int[] arr2 = { 1, 5, 19, 50, 89, 100 };
		int n2 = arr2.length;
		int[] arr3 = new int[n1 + n2];
		int i = 0, j = 0, k = 0;
		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}

		while (i < n1) {
			arr3[k++] = arr1[i++];//if any elements are left in arr1 they are added into the merged array
		}

		while (j < n2) {
			arr3[k++] = arr2[j++];//if any elements are left in arr2 they are added into the merged array
		}

		for (int l = 0; l < n1 + n2; l++) {
			System.out.print(arr3[l] + " ");
		}
	}

}
