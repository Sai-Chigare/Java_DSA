package Java_DSA.arrays;

public class stock_max_profit {
    public static void main(String[] args) {
        int stockPrice[]={7,1,5,4,6,3};
        maxProfit(stockPrice);
    }

    public static void maxProfit(int stockPrice[]){
        int maxProfit=0;
        int buyPrice=Integer.MAX_VALUE;

        for (int i = 0; i < stockPrice.length; i++) {


            if (buyPrice<stockPrice[i]) {//buy price is lower than today price then a day price
                int dayProfit = stockPrice[i]-buyPrice;
                if (dayProfit>maxProfit) {
                    maxProfit=dayProfit;
                }
            }else{//buy price it set to the lowest price
                buyPrice = stockPrice[i];
            }
        }

        System.out.println("max profit : "+maxProfit);

    }
}
