class Solution {
    public int maxArea(int[] arr) {
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            int vol=Math.min(arr[i],arr[j])*(j-i);
            max=Math.max(max,vol);
            if(arr[i]<arr[j]) i++;
            else j--;
        }
        return max;
    }
}
