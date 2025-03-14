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
    
    public static void main(String[] args) {
        System.out.println(decimal2binary(10));
    }
}
