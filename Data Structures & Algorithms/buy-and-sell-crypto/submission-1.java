class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=prices[0];
        for(int price: prices){
            profit= Math.max(profit,price-min);
            if(min>price) min=price;
         
        }
        return profit;
    }
}
