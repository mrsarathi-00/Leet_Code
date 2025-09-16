class Solution {
    public int numIdenticalPairs(int[] nums) {
        int fre[]=new int[101];
        int cnt=0;
        for(int num:nums){
            cnt+=fre[num];
            fre[num]++;
        }
        return cnt;
    }
}