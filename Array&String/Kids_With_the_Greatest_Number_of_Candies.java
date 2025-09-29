class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        List<Boolean> ans=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int n=candies.length;
        for(int i=0;i<n;i++){
            max=Math.max(max,candies[i]);
        }
        for(int i=0;i<n;i++){
            if(candies[i]+extra<max) ans.add(false);
            else ans.add(true);
        }
        return ans;
    }
}
