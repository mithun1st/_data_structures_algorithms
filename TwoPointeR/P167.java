package TwoPointeR;

public class P167 {
    public static int[] twoSum(int[] numbers, int target) {

        int sp = 0;
        int ep = numbers.length - 1;

        while (sp < ep) {
            final int sum = numbers[sp] + numbers[ep];
            if (target < sum) {
                ep--;
                continue;
            } else if (target > sum) {
                sp++;
                continue;
            }
            // IF sum==target THEN brea;
            break;
        }
        return new int[] { sp + 1, ep + 1 };
    }
}
