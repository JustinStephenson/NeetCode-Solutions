package org.example.problems.sliding_window;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int leftPointer = 0;
        int rightPointer = 0;
        int maxProfit = 0;

        for (; rightPointer < prices.length; rightPointer++) {
            maxProfit = Math.max(maxProfit, prices[rightPointer] - prices[leftPointer]);

            if (prices[rightPointer] < prices[leftPointer]) {
                leftPointer = rightPointer;
            }
        }

        return maxProfit;
    }
}
