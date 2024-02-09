package org.dsa.arrays;

public class MaxProfit {
    /**
     * Problem Link <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">....</a>
     * */
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int price = prices[0];
        for(int i=0;i< prices.length;i++){
            int currentProfit = prices[i]-price;
            maxProfit = currentProfit>maxProfit?currentProfit:maxProfit;
            if(prices[i]<price){
                price=prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7,6,5,4,3,2,1};
        System.out.println(maxProfit(prices));
    }
}
