class Solution {
    public int maxProfit(int[] prices) {

        var p = 0;

        for(int i=1; i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                p = p + (prices[i] - prices[i-1]);
            }
        }
        return p;
    }
    /*
    public int maxProfit(int[] prices) {
        

        var profit = 0;
        var isHold = false;
        var price=0;

        for(int i=0; i<prices.length;i++){

            if(isHold){
                // try to sell
                // sell only if next day price is lower then current price
                if((i != prices.length-1 && prices[i+1] < prices[i])|| i == prices.length-1){
                    var tempProfit = prices[i]-price;
                    isHold = false;
                    profit = profit + tempProfit;
                    //System.out.println("s at : "+prices[i]);
                }

            }else{
                // try to buy
                // buy only if next day price is higher then current day
                if(i != prices.length-1 && prices[i+1] > prices[i]){
                    price = prices[i];
                    isHold = true;
                    //System.out.println("b at : "+prices[i]);
                }
            }
        }

        return profit;
    }
    */
}