// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int n = prices.length;
        int max = 0;
        int minVal = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            
            if(prices[i] < minVal){
                minVal = prices[i];
            }
            int profit = prices[i] - minVal;
            if(profit > max){
                max = profit;
            }
        }
        return max;
    }
}