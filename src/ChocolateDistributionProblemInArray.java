import java.util.Arrays;

public class ChocolateDistributionProblemInArray {

	public static int min() {

		int[] arr = { 7, 3, 2, 4, 9, 12, 56 };
		int m = 3;// there are 3 students
		Arrays.sort(arr);
        int start = 0;
        int end = m-1;
        int min = Integer.MAX_VALUE;
        for(int i = end; i < arr.length; i++){
            if(arr[i] - arr[start] < min){
                min = arr[i] - arr[start];
            }
            start++;
        }
        return min;
	}

	public static void main(String[] args) {
		System.out.println(min());
	}
}
