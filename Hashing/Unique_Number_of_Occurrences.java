class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int temp=map.get(arr[i]);
                map.put(arr[i],temp+1);
            }
            else map.put(arr[i],1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr){
            set.add(map.get(x));
        }
        return map.size()==set.size();
    }
}
