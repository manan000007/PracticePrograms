import java.util.HashMap;

public class LongestPalindrome {

    public static void main(String[] args) {
        HashMap<String, Integer> result = findLongestPalindrome("aabaacdfrfg");
        result.forEach((k, v) -> System.out.println("String:" + k + " Value:" + v));
    }


    private static HashMap<String, Integer> findLongestPalindrome(String str) {
        int i = 0;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while (i < str.length()) {
            //String alpha = String.valueOf(str.charAt(i));
            if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
                String pali = str.substring(i, str.lastIndexOf(str.charAt(i)) + 1);
                if (isPalindrome(pali)) {
                    map.put(pali, pali.length());
                    i = str.lastIndexOf(str.charAt(i));
                }
            }
            i++;
        }
        return map;
    }

    public static boolean isPalindrome(String input) {
        for (int i = 0; i <= input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;

    }

}