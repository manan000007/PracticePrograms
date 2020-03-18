
public class FormAPalindrome {

	public static void main(String[] args) {

		String s = "abcd";
		int max = 0;
		String str = new StringBuilder(s).reverse().toString();
		int table[][] = new int[s.length() + 1][str.length() + 1];
		for (int i = 1; i < table.length; i++) {
			for (int j = 1; j < table[0].length; j++) {
				if (s.charAt(i - 1) == str.charAt(j - 1)) {
					table[i][j] = table[i - 1][j - 1] + 1;
				} else {
					table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
				}
				if (table[i][j] > max) {
					max = table[i][j];
				}
			}
		}
		System.out.println(s.length() - max);

	}

}
