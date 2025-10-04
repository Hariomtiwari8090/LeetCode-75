class Solution {
    public int maxOperations(int[] arr, int k) {
        int n=arr.length;
        Arrays.sort(arr);
        int i=0,j=n-1,c=0;
        while(i<j){
            if(arr[i]+arr[j]==k){
                c++;
                i++;
                j--;
            }
            else if(arr[i]+arr[j]>k) j--;
            else i++;
        }
        return c;
    }
}
