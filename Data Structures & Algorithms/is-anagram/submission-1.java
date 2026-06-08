class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        if(sArray.length != tArray.length){
            return false;
        }

        for(char a : sArray){
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for(char b : tArray){
            map.put(b, map.getOrDefault(b, 0) - 1);
        }
        for(char c : sArray){
            if(map.get(c) != 0){
                return false;
            }
        }
        return true;
    }
}
