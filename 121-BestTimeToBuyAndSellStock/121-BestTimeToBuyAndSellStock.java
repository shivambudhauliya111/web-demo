// Last updated: 24/06/2026, 14:29:33
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice)
            minPrice=prices[i];
            maxProfit=Math.max(prices[i]-minPrice,maxProfit);
        }
        return maxProfit;

        
    }
}