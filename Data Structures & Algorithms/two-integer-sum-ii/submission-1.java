class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int last = numbers.length - 1;
        int first = 0;

        while(first < last){
            int sum = numbers[first] + numbers[last];
            if(sum  == target){
                return new int[] {first + 1, last + 1};
            }
            if(sum > target){
                last--;
            }
            if(sum < target){
                first++;
            }   
        }
        return new int[0];
    }
}
