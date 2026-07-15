class Solution {
    public int trap(int[] height) {
        //prefix suffix solution
        int[] left_max = new int[height.length];
        int[] right_max = new int[height.length];
        int area = 0;

        left_max[0] = height[0];
        right_max[height.length - 1] = height[height.length - 1];

        for(int i = height.length - 2; i >= 0; i--){
            right_max[i] = Math.max(right_max[i + 1], height[i]);
        }

        for(int i = 1; i < height.length; i++){
            left_max[i] = Math.max(left_max[i-1], height[i]);
            if(Math.min(left_max[i], right_max[i]) - height[i] <= 0){
                continue;
            }
            else{
                area += Math.min(left_max[i], right_max[i]) - height[i];
            }
        }

        return area;
    }
}
