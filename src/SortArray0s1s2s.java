
public class SortArray0s1s2s {

	public static void main(String[] args) {

		int[] arr= {0,2,1,2,0};
		
		int count0=0,count1=0,count2=0;
		
		for(Integer i:arr){
			if(i==0)
				count0++;
			else if(i==1)
				count1++;
			else 
				count2++;
		}
		
		while(count0!=0) {
			System.out.print(0 +" ");
			count0--;
		}
		while(count1!=0) {
			System.out.print(1 +" ");
			count1--;
		}
		while(count2!=0) {
			System.out.print(2 +" ");
			count2--;
		}
	}

}
