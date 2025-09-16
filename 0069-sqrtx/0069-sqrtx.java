class Solution {
    public int mySqrt(int x) {
        if(x<2)return x;
        int strt=1;
        int end=x/2;
        int ans=0;
        while(strt<=end){
            int mid=strt+(end-strt)/2;
            if((long)mid*mid<=x){
                ans=mid;
                strt=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}