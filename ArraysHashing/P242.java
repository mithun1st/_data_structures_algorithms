package ArraysHashing;

public class P242 {
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            final int ascii1 = (int) s.charAt(i);
            final int ascii2 = (int) t.charAt(i);

            int index1 = ascii1 - (int) 'a';
            int index2 = ascii2 - (int) 'a';

            arr[index1] = arr[index1] + 1;
            arr[index2] = arr[index2] - 1;
        }

        for (int i : arr) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
