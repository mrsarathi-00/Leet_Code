class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hp=new HashSet<>();
        for(int num:nums){
            if(!hp.add(num)){
                return true;
            }
        }
        return false;
    }
}