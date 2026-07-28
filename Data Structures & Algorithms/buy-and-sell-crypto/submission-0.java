class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0;  // Buy index
        int right = 1; // Sell index

        while (right < prices.length) {
            // Is this a profitable transaction?
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // We found a lower price to buy at, so move left to right
                left = right;
            }
            // Always move the right pointer forward to check the next sell day
            right++;
        }

        return maxProfit;
    }
}