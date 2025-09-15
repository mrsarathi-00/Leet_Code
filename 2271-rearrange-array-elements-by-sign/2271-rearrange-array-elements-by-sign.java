class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer>pos=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }
        }
        List<Integer>neg=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            }
        }
        int cnt=0;
        int arr[]=new int[nums.length];
        int i=0,j=0;
        while(i<pos.size()&&j<neg.size()){
            arr[cnt++]=pos.get(i++);
            arr[cnt++]=neg.get(j++);
        }
      return arr;
    }
}