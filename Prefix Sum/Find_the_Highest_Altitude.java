class Solution {
    public int largestAltitude(int[] arr) {
        int n=arr.length;
        int[] pre=new int[n+1];
        int max=0;
        pre[0]=0;
        for(int i=0;i<n;i++){
            pre[i+1]=arr[i]+pre[i];
            max=Math.max(max,pre[i+1]);
        }
        return max;
    }
}
