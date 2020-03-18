
public class ReverseArrayInGroups {

	public static void main(String[] args) {

		int arr[]= {10,20,30,40,50,60};
		int k=2;
		int n=arr.length;
		
		StringBuffer sb=new StringBuffer(n);
	     
	    for(int i=0;i<n;i=i+k){
	        int l=((i+k-1)>=n?n-1:(i+k-1));
	        for(int m=l;m>=i;m--){
	           sb.append(arr[m]+" ");
	        }
	    }
	    System.out.println(sb);
	}

}
