class Solution {
    public int equalPairs(int[][] arr) {
        int n=arr.length;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            String temp="";
            for(int j=0;j<n;j++){
                temp+=arr[i][j];
                temp+=',';
            }
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        int c=0;
        for(int j=0;j<n;j++){
            String temp="";
            for(int i=0;i<n;i++){
                temp+=arr[i][j];
                temp+=',';
            }
            if(map.containsKey(temp)){
                c+=map.get(temp);
            }
        }
        return c;
    }
}
