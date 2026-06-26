class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] solution = new int[n];

        solution[0] = 1;
        for (int i = 1; i < n; i++) {
            solution[i] = solution[i-1] * nums[i-1];
        }

        int suffix = 1;
        for (int j = n-2; j >= 0; j--) {
            suffix *= nums[j+1];
            solution[j] *= suffix;
        }

        return solution;
    }
}