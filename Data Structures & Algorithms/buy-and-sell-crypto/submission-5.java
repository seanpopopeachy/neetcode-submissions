class Solution {
    public int maxProfit(int[] prices) {
    //     int min = prices[0];
    //     int max = 0;

    //     for(int i = 0; i < prices.length - 1; i++) {
    //         if(prices[i] < min) {
    //             min = i;
    //         }
    //     }

    //     for(int j = min + 1; j < prices.length; j++) {
    //         if(prices[j] > max && prices[j] > prices[min]) {
    //             max = j;
    //         }
    //     }

    //     if(max == min || max < min) {
    //         return 0;
    //     }

    //     int profit = prices[max] - prices[min];

    //     return profit;
    // 

    int min = prices[0];
    int maxProfit = 0;

    for(int i = 0; i < prices.length; i++) {
        if(prices[i] - min > maxProfit) {
            maxProfit = prices[i] - min;
        }

        if(prices[i] < min) {
            min = prices[i];
        }
    }

    return maxProfit;

    }
}














