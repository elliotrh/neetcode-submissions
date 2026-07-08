class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int solution = 0;
        for(int i : nums){
            set.add(i);
        }
        for(int j : set){
            if(!set.contains(j - 1)){
                int currentStreak = 1;
                while(set.contains(j + 1)){
                    j++;
                    currentStreak++;
                    }
                if(solution < currentStreak){
                        solution = currentStreak;
                }
            }
        }
        return solution;
    }
}
