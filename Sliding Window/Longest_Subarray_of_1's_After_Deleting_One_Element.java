class Solution {
    public int longestSubarray(int[] arr) {
        int n=arr.length;
        int i=0,j=0,nz=0,max=0;
        while(j<arr.length){
            if(arr[j]==0) nz++;
            if(nz>1){
                max=Math.max(max,j-i-1);
                while(arr[i]!=0) i++;
                nz--;
                i++;
            }
            j++;
        }
        max=Math.max(max,j-i-1);
        return max;
    }
}
