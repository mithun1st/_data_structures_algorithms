package ArraysHashing;

import java.util.HashMap;

public class P1 {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int expectedValue = target - nums[i];
            if (set.keySet().contains(expectedValue)) {
                // System.out.println(expectedValue);
                // System.out.println(nums[i]);
                return new int[] { set.get(expectedValue), i };
            }
            set.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        twoSum(new int[] { 2, 7, 11, 15 }, 9);
    }
}
