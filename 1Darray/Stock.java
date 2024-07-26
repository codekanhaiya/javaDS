public class Stock{
    private static void maxProfit(int sellArr[]){ // O(n)
        int profit=0;
        int buyPrice = Integer.MAX_VALUE; // for minimum buyPrice
        for(int i=0; i<sellArr.length; i++){
            if(sellArr[i]>buyPrice){
                int currDayProfit=sellArr[i]-buyPrice;
                profit=Math.max(profit,currDayProfit);
            }else{
                buyPrice=sellArr[i];
            }
        }
        System.out.println("Max profit: "+profit);
    }
    public static void main(String arg[]){
        int[] stockPrice={7, 1, 5, 3, 6, 4};
        maxProfit(stockPrice);
    }
}