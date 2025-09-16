class Solution {
    public int minOperations(int n) {
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=(2*i)+1;
        }
        int target=n;
        int cnt=0;
        for(int i=0;i<n/2;i++){
           cnt+=target-arr[i];
        }
        return cnt;
    }
}