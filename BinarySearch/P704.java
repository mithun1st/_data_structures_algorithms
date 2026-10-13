package BinarySearch;

public class P704 {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            final int midIndex = (right + left) / 2;
            final int midValue = nums[midIndex];

            if (midValue == target) {
                return midIndex;
            } else if (left == midIndex && midIndex == right) {
                break;
            } else if (midValue < target) {
                left = midIndex + 1;
            } else if (midValue > target) {
                right = midIndex - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[] { -1, 0, 3, 5, 9, 12 }, 9));
    }
}
