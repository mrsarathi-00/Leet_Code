class Solution {
    public int searchInsert(int[] nums, int target) {
        int strt=0;
        int last=nums.length-1;
        while(strt<=last){
            int mid=strt+(last-strt)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                strt=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return strt;
    }
}