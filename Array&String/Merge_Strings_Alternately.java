class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int i=0,j=0,k=0;
        while(i<word1.length() && j<word2.length()){
            if(k%2==0){
                ans+=word1.charAt(i++);
            }
            else ans+=word2.charAt(j++);
            k++;
        }
        while(i<word1.length()){
            ans+=word1.charAt(i++);
        }
        while(j<word2.length()){
            ans+=word2.charAt(j++);
        }
        return ans;
    }
}
