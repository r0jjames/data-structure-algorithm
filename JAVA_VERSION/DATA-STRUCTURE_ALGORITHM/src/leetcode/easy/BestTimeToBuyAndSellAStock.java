package leetcode.easy;
public class BestTimeToBuyAndSellAStock {

    public static int maxProfit(int[] prices) {
        int buyStock = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < buyStock) {
                buyStock = prices[i];
            } else {
                int currentProfit = prices[i] - buyStock;
                maxProfit = Math.max(currentProfit, maxProfit);
            }
        }
        return maxProfit;
    }
}
