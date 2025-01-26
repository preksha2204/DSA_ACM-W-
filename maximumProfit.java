import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class maximumProfit{
    public static int maximumProfit(ArrayList<Integer> prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0; 
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}