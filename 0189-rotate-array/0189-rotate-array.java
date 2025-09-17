class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        int cnt=0;
        int arr[]=new int[n];

        for(int i=n-k;i<n;i++){
            arr[cnt++]=nums[i];
        }
        for(int i=0;i<n-k;i++){
          arr[cnt++]=nums[i];
        }
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
    }
}