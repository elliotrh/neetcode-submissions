class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0;
        int bot = rows - 1;
        int targetRow = 0;

        while(bot >= top){
            targetRow = (bot + top)/2;
            if(target > matrix[targetRow][cols - 1]){
                top = targetRow + 1;
            }
            else if(target < matrix[targetRow][0]){
                bot = targetRow - 1;
            }
            else{
                break;
            }
        }
        if(top > bot){
            return false;
        }

        int left = 0;
        int right = cols - 1;
        while(left <= right){
            int targetCol = (left + right)/2;
            if(target == matrix[targetRow][targetCol]){
                return true;
            }
            else if(target > matrix[targetRow][targetCol]){
                left = targetCol + 1;
            }
            else{
                right = targetCol - 1;
            }
        }
        return false;
    }
}
