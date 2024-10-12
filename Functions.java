import java.util.*;
public class Functions {

    //sum of n numbers
    static int sumOfNum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    //N factorial
   static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    //sum of the digits
    static int sumOfDigits(int n){
        int sumOfDigits = 0;
        for (int i = n; i > 0; i = i/10) {
            int lastDigit = n % 10;
            sumOfDigits += lastDigit;
            n = n/10;
        }
        //easy way
        // while (n > 0) { 
        //     int lastDigit = n % 10;
        //     sumOfDigits += lastDigit;
        //     n = n/10;
        // }
        return sumOfDigits;
    }

    //ncr calculating combitions
    static int calculateNcr(int n, int r){
        int n_fact = 1;
        int r_fact = 1;
        int n_r_fact = 1;
         //to calculate the n!
        for (int i = 1; i <= n; i++) {
            n_fact *= i;
        }
        //calculate r! 
        for (int i = 1; i <= r; i++) {
            r_fact *= i;
        }
        //calculate (n-r)!
        for (int i = 1; i <= n-r; i++) {
            n_r_fact *= i;
        }
        int ncr = n_fact/(r_fact*n_r_fact);
        return ncr;
    }

    //alternate methode
    static int Ncr(int n, int r){
        //used n factorial methode
        int n_fact= factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n-r);

        int ncr = n_fact/(r_fact*n_r_fact);
        return  ncr;
    }

    //check the number is prime or not
    static  int  checkPrimeNumOrNot(int n){
        boolean isPrime = true;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("prime number");
        }else{
            System.out.println("non prime number");
        }
        return  0;
    }

    //print all prime numbers from 2 to n;
    static int printPrimeNum(int n){
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
           for (int j = 2; j <= i/2; j++) {
               if (i % j == 0) {
                isPrime = false;
                break;
               }
           }
           if (isPrime) {
            System.out.println(i);
           }
        }
        return 0;
    }

    //fibonacci series to n
    static int fibonacci(int n){
        int x= 0;
        int y= 1;
        int curr;
        for (int i = 0; i < n; i++) {
           curr = x+y;
           System.out.println(x);
           x = y;
           y = curr;
        }
        return  0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // System.out.println(sumOfNum(n));

       /* //this is by creating object of the class note:- it's work when the methode is non-static 
       Functions fact = new Functions();
       //calling the methode
        int facto = fact.factorial(n);
        // Calling the non-static method
        System.out.println(facto); */

    // System.out.println(factorial(n));
       
       // System.out.println(sumOfDigits(n));

       //int r = sc.nextInt();
       //System.out.println("the ncr is: " + calculateNcr(n, r));
       //System.out.println("the ncr is: " + Ncr(n, r));

       //System.out.println(checkPrimeNumOrNot(n));
        //System.out.println(printPrimeNum(n));
        System.out.println(fibonacci(n));
    }
}
