class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a=word1.length();
        int b=word2.length();
        int i=Math.min(a,b);
        String s="";
        int j=0;
        while(j!=i){
            s+=word1.charAt(j);
            s+=word2.charAt(j);
            j++;
        }
        
        if (a > b) {
            while(j!=a){
            s+=word1.charAt(j);
            j++;
        }
        } else if (b > a) {
            while(j!=b){
            s+=word2.charAt(j);
            j++;
        }
        }
        return s;
    }
}
