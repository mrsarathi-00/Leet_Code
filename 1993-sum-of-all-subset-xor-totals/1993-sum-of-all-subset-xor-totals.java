class Solution {
    public int subsetXORSum(int[] nums) {
        int cnt=0;
        for(int n:nums){
            cnt|=n;
        }
        return cnt*(1<<(nums.length-1));
    }
}