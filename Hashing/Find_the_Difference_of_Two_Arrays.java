class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ans1=new ArrayList<>();
        List<Integer> ans2=new ArrayList<>();
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
        }
        for(int key:map1.keySet()){
            if(!map2.containsKey(key)){
                ans1.add(key);
            }
        }
        for(int key:map2.keySet()){
            if(!map1.containsKey(key)){
                ans2.add(key);
            }
        }
        ans.add(ans1);
        ans.add(ans2);
        return ans;
    }
}
