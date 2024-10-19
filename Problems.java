
import java.util.Scanner;

public class Problems {

    //methode to find the a power b a^b this is bruteforce approach
    //to calculate the power => O(n)
    static double  calPower(double x, int n){
        double ans = 1;
        for (int i = 0; i < n; i++) {
            ans *= x;
        }
        return ans;
    }

    //but this linear but in the question the contraints is O(log n)
    //if we calculate by the binary code then loop is iterate n/2 times then
    //we get the log n 
    //so, first we convert the power into binary because we iterate the power times
    //then the power is multiple with power
    //if the digit is 1 then it multiple with the ans
    //then we decrese the number means remove the last digit
    static double myPow(double x, int n){
        
        if (n == 0) return 1.0;
        if(x == 0) return 0.0;
        if (x == 1) return 1.0;
        if(n == 1) return x;
        if(x == -1 && n % 2 == 0) return  1.0;
        if(x == -1 && n % 2 != 0) return  -1.0;
       
        double ans = 1;
        long binaryForm = n;
        if (n < 0) {
            x = 1/x;
            binaryForm = -binaryForm;
        }
        
        while(binaryForm > 0) {
            if (binaryForm % 2 == 1) {
                ans *= x;
            }
            x*= x;
            binaryForm/=2;
        }
        
        return ans;

    }

//121. Best time to buy and sell stocks
static int stocks(int[] prices){
    int bestBuy = 0;
    int buyPrice = Integer.MAX_VALUE;
    int sellPrice = Integer.MIN_VALUE;
    
    for (int i = 0; i < prices.length; i++) {
        if (prices[i] < buyPrice) {
            bestBuy = i;
            buyPrice = prices[i];
        }
    }
    for (int i = bestBuy+1; i < prices.length; i++) {
        if (prices[i] > sellPrice) {
            sellPrice = prices[i];
        }
    }
    return sellPrice - buyPrice;

}
//another way more optimized
static int stocks2(int[] prices){
    int bestBuy = prices[0];
    int maxProfit = 0;
    for (int i = 1; i < prices.length; i++) {
        if (prices[i] > maxProfit) {
            maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
        }
            bestBuy = Math.min(prices[i], bestBuy);
    }
    return maxProfit;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //double x = sc.nextDouble();
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = sc.nextInt();
            
         }
        //System.out.println(calPower(x, n));
        //System.out.println(myPow(x, n));
        //System.out.println(stocks(arr));
         System.out.println(stocks2(arr));
    }
}
