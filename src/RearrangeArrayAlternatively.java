
public class RearrangeArrayAlternatively {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };//6,1,5,2,4,3
		int temp[]=new int[arr.length];
		
		int small = 0, large = arr.length - 1;
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {

			if (flag)
				temp[i] = arr[large--];
			else
				temp[i] = arr[small++];
			flag = !flag;
		}

		arr=temp.clone();
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

}
