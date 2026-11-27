class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int len = Math.min(word1.length(), word2.length());
        int n1=0,n2=0;

        while(n1<len && n2<len){
            str.append(word1.charAt(n1++));
            str.append(word2.charAt(n2++));
        }

        while(n1<word1.length()){
            str.append(word1.charAt(n1++));
        }

        while(n2<word2.length()){
            str.append(word2.charAt(n2++));
        }

        return str.toString();
    }
}