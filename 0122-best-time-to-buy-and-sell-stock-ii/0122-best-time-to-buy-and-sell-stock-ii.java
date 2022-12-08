class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0, n=prices.length;
    for(int i=0; i<n-1; i++){
        int profit= prices[i+1]-prices[i];
            if(profit>0){
                sum+=profit;
                
            }
    }
        return sum;
    }
}