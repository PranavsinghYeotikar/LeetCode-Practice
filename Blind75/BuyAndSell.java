public class BuyAndSell {
    public static void main(String[] args) {
        int prices[] = {7, 6, 4, 3, 1, 6};
        if(prices.length == 0) System.out.println("No");

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }
            else{
                int profit = prices[i] - minPrice;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }

        System.out.println(maxProfit);
        
    }
}
