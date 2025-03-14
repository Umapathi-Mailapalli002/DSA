public class Recap {
    static int decimal2binary(int num) {
        int n = 0;
        int pw = 1;
        while (num > 0) { 
            int lastDigit = num%2;
            n += lastDigit * pw;
            num /= 2;
            pw*=10;
        }
        return n;
    }
    static  int binary2Decimal(int num){
        int decimalNum = 0;
        int pw = 1;
        while (num > 0) { 
            int lastDigit = num % 10;
            decimalNum += lastDigit * pw;
            num/=10;
            pw*=2;
        }
        return  decimalNum;
    }
    public static void main(String[] args) {
        System.out.println(decimal2binary(10));
        System.out.println(binary2Decimal(1010));
    }
}
