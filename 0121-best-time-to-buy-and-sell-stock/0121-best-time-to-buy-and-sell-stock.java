class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int minprice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(minprice<prices[i]){
               int profit=prices[i]-minprice;
               maxprofit=Math.max(maxprofit,profit);
            }
            else{
                minprice=prices[i];
            }
        }
        return maxprofit;
    }
}