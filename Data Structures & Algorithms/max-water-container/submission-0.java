class Solution {
    public int maxArea(int[] heights) {
    //brute force solution
    int max = 0;
    int height = 0;

    for(int i = 0; i < heights.length - 1; i++){
        for(int j = heights.length - 1; j > 0; j--){
            int length = j - i;
            if(heights[i] < heights [j]){
                height = heights[i];
            }
            else{
                height = heights[j];
            }

            int currentMax = length * height;
            if(currentMax > max){
                max = currentMax;
            }
        }
    } 
    return max;
    }
}
