
public class LastIndexOf1InArray {

	public static void main(String[] args) {
		String s="00001";
		getOne(s);
	}

	static void getOne(String s) {
		int ans = -1;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '1') {
				ans = i;
				break;
			} else
				continue;
		}
		System.out.println(ans);
	}

}
