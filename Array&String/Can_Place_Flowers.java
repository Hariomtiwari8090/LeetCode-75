class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m=flowerbed.length,c=0;
        for(int i=0;i<m;i++){
            if(flowerbed[i]==0){
                int l=0,h=0;
                if(i!=0) l=flowerbed[i-1];
                if(i!=m-1) h=flowerbed[i+1];
                if(l==0 && h==0){
                    c++;
                    flowerbed[i]=1;
                }
            }
        }
        return c>=n;
    }
}
