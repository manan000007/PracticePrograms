import java.util.Stack;

public class RemoveAdjacentDuplicates {

	public static void main(String[] args) {

		String str = "aacbbcde";
		String result = remove(str);
		System.out.println(result);
	}

	private static String remove(String str) {

		Stack<Character> st = new Stack<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (!st.isEmpty() && st.peek() == str.charAt(i)) {
				st.pop();
			} else {

				st.push(str.charAt(i));
			}
		}
		for (Character ch : st) {
			sb.append(ch);
		}
		return sb.toString();
	}

}
