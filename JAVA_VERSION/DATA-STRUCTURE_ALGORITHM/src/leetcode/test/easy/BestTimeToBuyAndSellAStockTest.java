package leetcode.test.easy;

import leetcode.easy.BestTimeToBuyAndSellAStock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
121. Best Time to Buy and Sell Stock
Problem:
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0.

Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */
class BestTimeToBuyAndSellAStockTest {

    private final BestTimeToBuyAndSellAStock bestTimeToBuyAndSellAStock;

    BestTimeToBuyAndSellAStockTest() {
        bestTimeToBuyAndSellAStock = new BestTimeToBuyAndSellAStock();
    }

    @Test
    void testMaxProfit1() {
        int[] prices = {7, 2, 4, 5, 1, 3, 6, 4};

        assertEquals(5, bestTimeToBuyAndSellAStock.maxProfit(prices));
        assertEquals(5, bestTimeToBuyAndSellAStock.maxProfit2(prices));
    }

    @Test
    void testMaxProfit2() {
        int[] prices = {7, 1, 5, 3, 6, 4};

        assertEquals(5, bestTimeToBuyAndSellAStock.maxProfit(prices));
        assertEquals(5, bestTimeToBuyAndSellAStock.maxProfit2(prices));
    }

    @Test
    void testMaxProfit3() {
        int[] prices = {7, 6, 4, 3, 1};

        assertEquals(0, bestTimeToBuyAndSellAStock.maxProfit(prices));
        assertEquals(0, bestTimeToBuyAndSellAStock.maxProfit2(prices));
    }

    @Test
    void testMaxProfit4() {
        int[] prices = {2};

        assertEquals(0, bestTimeToBuyAndSellAStock.maxProfit(prices));
        assertEquals(0, bestTimeToBuyAndSellAStock.maxProfit2(prices));
    }
}