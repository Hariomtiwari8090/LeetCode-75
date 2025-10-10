class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='*') st.pop();
            else st.push(c);
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}

----------------------------------------------------

class Solution {
    public String removeStars(String s) {
        int ns=0;
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c=='*') ns++;
            else if(ns!=0 && c!='*'){
                ns--;
                continue;
            }
            else sb.append(c);
        }
        return sb.reverse().toString();
    }
}
