package ArraysHashing;

public class p238 {
    public static int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        // Prefix
        int totalMul = 1;
        for (int i = 0; i < result.length; i++) {
            result[i] = totalMul;
            totalMul *= nums[i];
        }

        // Postfix and multiply with result
        totalMul = 1;
        for (int i = result.length - 1; 0 <= i; i--) {
            result[i] *= totalMul;
            totalMul *= nums[i];
        }

        for (int i : result) {
            System.out.print(i + ", ");
        }
        System.out.println();

        return result;
    }

    public static void main(String[] args) {
        productExceptSelf(new int[] { 1, 2, 3, 4 });
        // productExceptSelf(new int[] { -1, 1, 0, -3, 3 });
        // productExceptSelf(new int[] { 0, 0 });
        // productExceptSelf(new int[] { 0, 0, 0 });

        ///
        /// 1 2 3 4
        ///
        /// 1 2 6 24
        /// 24 24 12 4
        ///
        /// 24 12 8 6

        ///
        /// -1 1 0 -3 3
        ///
        /// -1 -1 0 0 9
        /// -1 0 0 9 3
        ///
        /// 0 0 9 0 0
    }
}
