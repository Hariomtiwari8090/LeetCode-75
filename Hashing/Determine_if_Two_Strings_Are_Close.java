class Solution {
    public boolean closeStrings(String s1, String s2) {
        int n=s1.length(),m=s2.length();
        if(n!=m) return false;
        int[] arr=new int[26];
        int[] arr1=new int[26];
        for(int i=0;i<n;i++){
            arr[s1.charAt(i)-'a']++;
            arr1[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0 && arr1[i]==0) continue;
            else if(arr[i]==0 || arr1[i]==0) return false;
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for(int i=0;i<26;i++){
            if(arr[i]!=arr1[i]) return false;
        }
        return true;
    }
}

-----------------------------------------------------------------------

class Solution {
    public boolean closeStrings(String s1, String s2) {
        int n=s1.length(),m=s2.length();
        if(n!=m) return false;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<n;i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
            set.add(s1.charAt(i));
        }
        for(char key:map2.keySet()){
            if(!set.contains(key)) return false;
        }
        int[] arr=new int[n];
        int[] arr2=new int[n];
        int j=0;
        for(int val:map1.values()){
            arr[j++]=val;
        }
        j=0;
        for(int val:map2.values()){
            arr2[j++]=val;
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i=0;i<n;i++){
            if(arr[i]!=arr2[i]) return false;
        }
        return true;
    }
}
