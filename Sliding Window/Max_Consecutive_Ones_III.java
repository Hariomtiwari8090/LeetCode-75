class Solution {
    public int longestOnes(int[] arr, int k) {
        int n=arr.length;
        int i=0,j=0,nz=0,max=0;
        while(j<n){
            if(arr[j]==0) nz++;
            if(nz>k){
                max=Math.max(max,j-i);
                while(arr[i]!=0) i++;
                i++;
                nz--;
            }
            j++;
        }
        max=Math.max(max,j-i);
        return max;
    }
}
