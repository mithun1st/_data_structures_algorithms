package ArraysHashing;

import java.util.HashSet;

public class p36 {

    public static boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] row = new HashSet[board.length];
        HashSet<Character>[] col = new HashSet[board.length];
        HashSet<Character>[] box = new HashSet[board.length];

        for (int i = 0; i < board.length; i++) {
            row[i] = new HashSet<>(board.length);
            col[i] = new HashSet<>(board.length);
            box[i] = new HashSet<>(board.length);
        }

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                final char value = board[r][c];
                if (value == '.') {
                    continue;
                }
                final int boxIndex = (r / 3) * 3 + (c / 3);

                if (row[r].contains(value) || col[c].contains(value) || box[boxIndex].contains(value)) {
                    return false;
                }

                row[r].add(value);
                col[c].add(value);
                box[boxIndex].add(value);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] c1 = new char[][] {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        System.out.println(isValidSudoku(c1));
    }
}
