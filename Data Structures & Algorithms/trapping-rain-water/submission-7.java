class Solution {
    public int trap(int[] height) {
        //two pointer solution
        int leftMax = height[0];
        int rightMax = height[height.length-1];
        int left = 0;
        int right = height.length - 1;
        int area = 0;

        while(left < right){
            if(leftMax <= rightMax){
                left++;
                leftMax = Math.max(leftMax, height[left]);
                area += leftMax - height[left];
            }
            else{
                right--;
                rightMax = Math.max(rightMax, height[right]);
                area += rightMax - height[right];
            }
        }
        return area;
    }
}
