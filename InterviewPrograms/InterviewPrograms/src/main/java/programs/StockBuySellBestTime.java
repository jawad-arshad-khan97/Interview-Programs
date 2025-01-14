package programs;

public class StockBuySellBestTime {

    public static int getMaxProfit(int prices[]) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);

            maxProfit = Math.max(maxProfit, (prices[i] - minPrice));
        }

        return maxProfit;

    }

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
    System.out.println(getMaxProfit(prices));
    }

}
