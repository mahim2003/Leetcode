class Solution {
    public int maxProfit(int[] prices) {
    
    int maxProfit = 0;
    if(prices.length==1){
        return 0;
    }
    int left = 0;
    int right = 1;
    while(right<prices.length){
        maxProfit = Math.max(maxProfit,(prices[right]-prices[left]));
        if(prices[left]<=prices[right]){
            right++;
        }
        else{
            left=right;
            right++;
        }
    }
    return maxProfit;
    
    }
}

/*
 * Problem Number: 121
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */