class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int c=0,j=0;
        while(j<k){
            if(vowel(s.charAt(j++))) c++;
        }
        int max=c,i=0;
        while(j<n){
            if(vowel(s.charAt(i))) c--;
            if(vowel(s.charAt(j))) c++;
            i++;
            j++;
            max=Math.max(max,c);
        }
        return max;
    }
    public boolean vowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') return true;
        return false;
    }
}
