class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int s=0;
        for(int num:nums){
            if(hs.contains(num)){
                s-=num;
            }
            else{
                hs.add(num);
                s+=num;
            }
        }
        return s;
    }
}