package BinarySearch;

public class P74 {
    public static boolean searchMatrix(int[][] matrix, int target) {

        int startPointer = 0;
        int endPointer = (matrix.length * matrix[0].length) - 1;

        while (startPointer <= endPointer) {

            final int midIndex = (startPointer + endPointer) / 2;

            final int row = midIndex / matrix[0].length;
            final int col = midIndex % matrix[0].length;
            final int midValue = matrix[row][col];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                startPointer = midIndex + 1;
            } else if (midValue > target) {
                endPointer = midIndex - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } }, 3));
    }
}
