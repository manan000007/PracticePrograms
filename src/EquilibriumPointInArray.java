
public class EquilibriumPointInArray {

	public static int equilibrium() {

		int arr[]= {1,3,5,2,2};
		long totalSum = 0;
		for(int i=0;i<arr.length;i++) {
			totalSum+=arr[i];
		}
		
	    long lowSum = 0L;
	    for (int i = 0; i < arr.length; i++) {
	        totalSum -= arr[i];
	        if (lowSum == totalSum) {
	            return i;
	        }
	        lowSum += arr[i];
	    }
	    return -1;
	}

	public static void main(String[] args) {
		System.out.println(equilibrium());
	}
}
