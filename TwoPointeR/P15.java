package TwoPointeR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P15 {
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int st = i + 1;
            int et = nums.length - 1;

            while (st < et) {

                final int sum = nums[i] + nums[st] + nums[et];

                if (sum > 0) {
                    et--;
                } else if (sum < 0) {
                    st++;
                } else {
                    ArrayList<Integer> tem = new ArrayList<>();
                    tem.add(nums[i]);
                    tem.add(nums[st]);
                    tem.add(nums[et]);

                    list.add(tem);
                    st++;
                    while (nums[st] == nums[st - 1] && st < et) {
                        st++;
                    }
                }
            }

        }
        // System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        // threeSum(new int[] {
        // 3, -9, 3, 9, -6, -1, -2, 8, 6, -7, -14, -15, -7, 5, 2, -7, -4, 2, -12, -7,
        // -1, -2, 1, -15, -13, -4, 0,
        // -9, -11, 7, 4, 7, 13, 14, -7, -8, -1, -2, 7, -10, -2, 1, -10, 6, -9, -1, 14,
        // 2, -13, 9, 10, -7, -8, -4,
        // -14, -5, -1, 1, 1, 4, -15, 13, -12, 13, 12, -11, 12, -12, 2, -3, -7, -14, 13,
        // -9, 7, -11, 5, -1, -2, -1,
        // -7, -7, 0, -7, -4, 1, 3, 3, 9, 11, 14, 10, 1, -13, 8, -9, 13, -2, -6, 1, 10,
        // -5, -6, 0, 1, 8, 4, 13, 14,
        // 9, -2, -15, -13
        // });
        System.out.println(threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
        System.out.println(threeSum(new int[] { -3, 3, 4, -3, 1, 2 }));
    }
}
