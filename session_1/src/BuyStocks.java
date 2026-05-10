public class BuyStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 0; i < prices.length; i++) {
            int profit = prices[i] - minPrice;

            if (prices[i]<minPrice){
                minPrice = prices[i];
            }

            maxProfit = Math.max(profit, maxProfit);
        }
        System.out.println("Max Profit : " + maxProfit);
    }
}
