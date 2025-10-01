class Solution {
    public String reverseWords(String s) {
        String ans="";
        int n=s.length();
        int i=n-1,j=n-1;
        while(i>=0){
            if(s.charAt(i)==' ' && s.charAt(j)==' '){
                i--;
                j--;
            }
            else if(s.charAt(i)==' '){
                ans+=s.substring(i+1,j+1);
                ans+=' ';
                j=i;
            }
            else i--;
        }
        ans+=s.substring(i+1,j+1);
        if(ans.charAt(ans.length()-1)==' ') ans=ans.substring(0,ans.length()-1);
        return ans;
    }
}
