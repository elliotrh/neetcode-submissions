class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixSum = new int[nums.length], suffixSum = new int[nums.length], solution = new int[nums.length];
        int prefix = 1, suffix = 1;

        prefixSum[0] = 1;
        for(int i = 1; i < nums.length; i++){
            prefixSum[i] = prefix*nums[i-1];
            prefix = prefixSum[i];
        }
        
        suffixSum[nums.length-1] = 1;
        for(int j = nums.length - 2; j >= 0; j--){
            suffixSum[j] = suffix*nums[j+1];
            suffix = suffixSum[j];
        }

        for(int k = 0; k < nums.length; k++){
            solution[k] = prefixSum[k] * suffixSum[k];
        }

        return solution;
    }
}  
