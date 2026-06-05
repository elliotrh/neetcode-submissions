class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int[] count = new int[26];

        //increment the count array where the lowercase value would be (example: letter c would increment position 3 by 1)
        for(int i = 0; i < sArray.length; i++){
            count[sArray[i] - 'a']++;
        }
        for(int j = 0; j < tArray.length; j++){
            count[tArray[j] - 'a']--;
        }
        //iterate through the array and check if every value is equal to 0
        for(int val : count){
            if(val != 0) return false;
        }
        return true;
    }
}