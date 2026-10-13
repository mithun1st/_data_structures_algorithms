package TwoPointeR;

public class P125 {

    public static boolean isAlphanumeric(char c) {
        if (('a' <= c && c <= 'z') || ('0' <= c && c <= '9')) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            final char chS = s.charAt(start);
            final char chE = s.charAt(end);

            if (!isAlphanumeric(chS)) {
                start++;
                continue;
            } else if (!isAlphanumeric(chE)) {
                end--;
                continue;
            }

            // System.out.println(chS + " " + chE);

            if (chS != chE) {
                return false;
            }

            start++;
            end--;

        }
        return true;
    }

    public static void main(String[] args) {
        // System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        // System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("1a2"));
    }
}
