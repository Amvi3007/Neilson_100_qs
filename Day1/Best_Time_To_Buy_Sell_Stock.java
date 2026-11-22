public class Best_Time_To_Buy_Sell_Stock {

    public static int stock(int[] prices){
        int profit = 0;
        int min = prices[0];
        for(int i = 1;i<prices.length;i++){
            profit = Math.max(profit,prices[i]-min);
            min = Math.min(min,prices[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        System.out.print(stock(prices));
    }
}
