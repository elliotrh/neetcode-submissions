class Solution {
    public boolean isPalindrome(String s) {
        String lowerCaseInput = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        char[] charArray = lowerCaseInput.toCharArray();
        for(char ch:charArray){
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        charArray = sb.toString().toCharArray();

        int first = 0, last = charArray.length - 1;
        while(first <= last){
            if(charArray[first] != charArray[last]){
                return false;
            }
            first++;
            last--;
        }

        return true;
    }
}
