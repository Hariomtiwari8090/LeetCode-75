class Solution {
    public String gcdOfStrings(String s1, String s2) {
        if(!(s1+s2).equals(s2+s1)) return "";
        int n1=s1.length(),n2=s2.length();
        while(n1%n2!=0){
            int t=n1%n2;
            n1=n2;
            n2=t;
        }
        return s1.substring(0,n2);
    }
}
