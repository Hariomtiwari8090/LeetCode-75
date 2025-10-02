class Solution {
    public boolean increasingTriplet(int[] arr) {
        int n=arr.length;
        if(n<3) return false;
        int f=Integer.MAX_VALUE,s=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<=f) f=arr[i];
            else if(arr[i]<=s) s=arr[i];
            else return true;
        }
        return false;
    }
}
