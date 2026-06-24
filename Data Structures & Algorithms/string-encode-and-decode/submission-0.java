class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs){
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        
        int i = 0;
        while(i < str.length()){
            int delimiterIndex = str.indexOf('#', i);
            int stringLength = Integer.parseInt(str.substring(i, delimiterIndex));
            result.add(str.substring(delimiterIndex + 1, stringLength + delimiterIndex + 1));
            i = delimiterIndex + stringLength + 1;
        }
        return result;
    }
}
