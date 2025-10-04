class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int j=0;
        double sum=0;
        while(j<k){
            sum+=arr[j];
            j++;
        }
        double avg=sum/k;
        int i=1;
        while(j<arr.length){
            sum-=arr[i-1];
            sum+=arr[j];
            avg=Math.max(avg,sum/k);
            i++;
            j++;
        }
        return avg;
    }
}
