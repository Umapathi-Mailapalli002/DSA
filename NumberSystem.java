import java.util.*;
public class NumberSystem {
    //decimal to binary
    static int decimal2Binary(int n){
        int binaryNum = 0;
        int pw = 1;
        while (n > 0) { 
            int lastDigit = n % 2;
            binaryNum += lastDigit * pw;
            n /= 2;
            pw *= 10;
        }
        return  binaryNum;
    }

    //binary to decimal
    static int binary2Decimal(int n){
        int decimalNum = 0;
        int pw = 1;
        while (n > 0) { 
            int lastDigit = n % 10;
            decimalNum += lastDigit*pw;
            pw *= 2;
            n/=10;
        }
        return decimalNum;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt(); 
       //System.out.println(decimal2Binary(n));
       System.out.println(binary2Decimal(n));
    }
}
