package ArraysHashing;

import java.util.HashSet;

public class P217 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] { 11, 22, 33, 44, 55, 66 }));
    }
}
