class Solution {
    public int trap(int[] height) {
    //brute force solution
        int area = 0;
        for(int i = 1; i < height.length - 1; i++){
            int left_max = 0; int right_max = 0;
            for(int j = 0; j < i; j++){
                if(left_max < height[j]){
                    left_max = height[j];
                }
            }
            for(int k = i + 1; k < height.length; k++){
                if(right_max < height[k]){
                    right_max = height[k];
                }
            }

            if(Math.min(left_max, right_max) - height[i] <= 0){
                continue;
            }
            else{
                area += Math.min(left_max, right_max) - height[i];
            }
        }
        return area;
    }
}
