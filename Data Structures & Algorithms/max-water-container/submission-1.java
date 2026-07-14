class Solution {
    public int maxArea(int[] heights) {
    //two pointer solution
        int max = 0;
        int left = 0;
        int right = heights.length - 1;

        while(left < right){
            int width = right - left;
            int height = Math.min(heights[left], heights[right]);
            int currentMax = width * height;
            if(currentMax > max) max = currentMax;
            if(heights[left] < heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
