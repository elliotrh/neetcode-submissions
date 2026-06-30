class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char cell = board[row][col];
                String rowKey = "row" + row + cell;
                String colKey = "col" + col + cell;
                String boxKey = "box" + (row/3) + (col/3) + cell;
                if (cell != '.'){
                    if (!seen.add(rowKey)) return false;
                    if (!seen.add(colKey)) return false;
                    if (!seen.add(boxKey)) return false;
                }
                
            }   
        }   
        return true;
    }
}
