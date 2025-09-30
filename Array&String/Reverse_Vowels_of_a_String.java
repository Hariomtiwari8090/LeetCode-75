class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j){
            if(!isvowel(ch[i])) i++;
            else if(!isvowel(ch[j])) j--;
            else{
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
        }
        String s1="";
        for(int k=0;k<ch.length;k++){
            s1+=ch[k];
        }
        return s1;
    }
    public Boolean isvowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ){
            return true;
        }
        else return false;
    }
}
