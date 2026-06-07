class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> TwoSumArray = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if(TwoSumArray.containsKey(difference)){
                int j = TwoSumArray.get(difference);
                return new int[] {j, i};
            }
            TwoSumArray.put(nums[i], i);
        }

        return new int[] {};
    }
}
