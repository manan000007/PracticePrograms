
public class ReverseWordsInAString {

	public static void main(String[] args) {

		String s="i.like.this.program.very.much";
		String []words=s.split("\\.");
		
		for(int i=words.length-1;i>=0;i--) {
			System.out.print(words[i]+".");
		}
	}

}
