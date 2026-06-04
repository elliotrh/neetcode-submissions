class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniqueInts = new HashSet<>();
        for(int i : nums){
            if(uniqueInts.contains(i)){
                return true;
            }
            uniqueInts.add(i);
        }
        return false;
            
    }
}