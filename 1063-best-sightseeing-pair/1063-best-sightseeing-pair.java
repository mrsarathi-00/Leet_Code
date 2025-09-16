class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int left=values[0];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<values.length;i++){
            max=Math.max(max,left+values[i]-i);
            left=Math.max(left,values[i]+i);
        }
        return max;
    }
}