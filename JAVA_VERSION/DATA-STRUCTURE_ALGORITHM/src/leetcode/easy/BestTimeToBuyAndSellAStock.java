package leetcode.easy;
public class BestTimeToBuyAndSellAStock {

    public static int maxProfit(int[] prices) {
        int buy_price = prices[0];
        int profit = 0;
        for(int i=1; i < prices.length; i++) {
            if (prices[i] < buy_price) {
                buy_price = prices[i];
            }
            profit = Math.max(profit, prices[i] - buy_price);
        }
        return profit;
    }
    // Two Pointer Approach
    public static int maxProfit2(int[] prices) {
        int left = 0; // Buy Price
        int right = 1; // Sell Price
        int profit = 0;
        while(right < prices.length) {
            if(prices[left] < prices[right]) {
                profit = Math.max(profit, prices[right] - prices[left]);
            } else {
                left = right;
            }
            right++;
        }
        return profit;
    }
}
