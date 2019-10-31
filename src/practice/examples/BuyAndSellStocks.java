package practice.examples;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 */
public class BuyAndSellStocks {
    public static int solution(int[] prices) {
        int profit = 0;
        for (int i = 0, j = 0; j < prices.length;) {
            if ( j + 1 != prices.length && prices[j + 1] >= prices[j]) {
                j++;
            } else {
                profit += prices[j] - prices[i];
                i = j + 1;
                j = i;
            }
        }
        return profit;
    }
}
