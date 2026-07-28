class Solution {
    public int maxProfit(int[] prices) {
        int maxCur = 0;   // Current subarray sum
        int maxSoFar = 0; // Max subarray sum found

        for (int i = 1; i < prices.length; i++) {
            int dailyDiff = prices[i] - prices[i - 1];
            maxCur = Math.max(0, maxCur + dailyDiff);
            maxSoFar = Math.max(maxSoFar, maxCur);
        }

        return maxSoFar;
    }
}
//kadane algorithm
// $$\text{prices}[j] - \text{prices}[i] = \sum_{k=i+1}^{j} (\text{prices}[k] - \text{prices}[k-1])$$