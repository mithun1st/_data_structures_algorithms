package Stack;

import java.util.Arrays;

public class P853 {
    public static int carFleet(int target, int[] position, int[] speed) {

        int[][] combo = new int[position.length][2];

        for (int i = 0; i < position.length; i++) {
            combo[i] = new int[] { position[i], speed[i] };
        }

        Arrays.sort(combo, (a, b) -> Integer.compare(b[0], a[0]));

        double previousTimeLeft = (double) (target - combo[0][0]) / combo[0][1];
        int fleet = 1;

        for (int i = 1; i < combo.length; i++) {
            final double currentTimeLeft = (double) (target - combo[i][0]) / combo[i][1];
            if (previousTimeLeft < currentTimeLeft) {
                fleet++;
                previousTimeLeft = currentTimeLeft;
            }
        }

        return fleet;
    }

    public static void main(String[] args) {
        final int value = carFleet(12, new int[] { 10, 8, 0, 5, 3 }, new int[] { 2, 4, 1, 1, 3 });
        System.out.println(value);

    }
}
