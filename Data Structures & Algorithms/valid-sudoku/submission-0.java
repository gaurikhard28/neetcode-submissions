class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];

                // What will you check here?
                if (ch == '.') {
                    continue;
                }

                if (!set.add(ch)) {
                    return false;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                char ch = board[j][i];

                // What will you check here?
                if (ch == '.') {
                    continue;
                }

                if (!set.add(ch)) {
                    return false;
                }
            }
        }
        for (int box = 0; box < 9; box++) {
            int startRow = (box / 3) * 3;
            int startCol = (box % 3) * 3;

            // int startRow = (i / 3) * 3;
            // int startCol = (j / 3) * 3;
            Set<Character> set = new HashSet<>();
            for (int r = startRow; r < startRow + 3; r++) {
                for (int c = startCol; c < startCol + 3; c++) {
                    char ch = board[r][c];

                    if (ch == '.')
                        continue;

                    if (!set.add(ch))
                        return false;
                }
            }
        }
        return true;
    }
}
