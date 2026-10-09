package EXE_31;
public class EXE31 {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("\\s+", "");

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("MadAm"));
        System.out.println(isPalindrome("Hello"));
        System.out.println(isPalindrome("A man a plan a canal Panama"));
    }
}