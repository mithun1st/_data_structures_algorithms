package TwoPointeR;

public class P11 {
    public static int maxArea(int[] height) {
        int area = 0;
        int sp = 0, ep = height.length - 1;

        while (sp < ep) {

            // find area
            final int d = ep - sp;
            int s;
            if (height[sp] < height[ep]) {
                s = height[sp];
            } else {
                s = height[ep];
            }
            final int temArea = d * s;

            // store max area
            if (area < temArea) {
                area = temArea;
            }

            // pointer adjustment
            if (height[sp] < height[ep]) {
                sp++;
            } else {
                ep--;
            }
        }

        return area;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[] { 2, 1, 2 }));
    }
}
