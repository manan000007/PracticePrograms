
public class StringRotationBy2Places {

	public static void main(String[] args) {

		int result=isRotation("amazon", "azonam");
		System.out.println(result);
	}

	static int isRotation(String a, String b){
        String anti = a.substring(2) + a.substring(0, 2);
        String clock = a.substring(a.length() - 2, a.length()) + a.substring(0, a.length() - 2);
        return b.equals(anti) || b.equals(clock) ? 1 : 0;
    }
}
