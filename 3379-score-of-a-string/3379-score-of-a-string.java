class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=1;i<s.length();i++){
            int pre=s.charAt(i-1);
            int cur=s.charAt(i);
            sum+=Math.abs(cur-pre);
        }
        return sum;
    }
}