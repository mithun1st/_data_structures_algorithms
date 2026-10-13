package TwoPointeR;

public class P42 {
    public static int trap(int[] height) {
        int startPointer = 0;
        int endPointer = height.length - 1;

        int leftMax = height[startPointer];
        int rightMax = height[endPointer];

        int totalTrapWater = 0;

        while (startPointer < endPointer) {
            if (height[startPointer] <= height[endPointer]) {
                startPointer++;

                final int value = leftMax - height[startPointer];
                if (value > 0) {
                    totalTrapWater += value;
                }
                // Store Left Max
                if (height[startPointer] > leftMax) {
                    leftMax = height[startPointer];
                }
            } else {
                endPointer--;

                final int value = rightMax - height[endPointer];
                if (value > 0) {
                    totalTrapWater += value;
                }
                // Store Right Max
                if (height[endPointer] > rightMax) {
                    rightMax = height[endPointer];
                }
            }

        }

        return totalTrapWater;
    }

    public static void main(String[] args) {
        final int[] num1 = new int[] {
                0, 1, 0, 3, 3, 4, 0, 3, 0,
                5, 3, 1, 0, 1, 3, 2, 1, 2, 1
        };// 18
          // final int[] num1 = new int[] { 5, 4, 1, 2 };
          // final int[] num1 = new int[] {
          // 4, 3, 3, 9, 3, 0, 9, 2, 8, 3
          // };

        System.out.println("\n\n=" + trap(num1));
    }

}
