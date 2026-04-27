package ArraysHashing;

import java.util.HashSet;

public class P128 {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int result = 0;

        for (int e : set) {
            if (set.contains(e - 1)) {
                continue;
            }

            int count = 0;
            while (set.contains(e++)) {
                count++;
            }

            if (result < count) {
                result = count;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 }));
    }
}
