class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder str = new StringBuilder();
        int n = strs.length;
        int len = Math.min(strs[0].length(), strs[n-1].length());

        for(int i=0;i<len;i++){
            if(strs[0].charAt(i)==strs[n-1].charAt(i)) str.append(strs[0].charAt(i));
            else break;
        }

        return str.toString();
    }
}