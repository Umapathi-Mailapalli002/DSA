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
       int r = sc.nextInt();
       System.out.println("the ncr is: " + calculateNcr(n, r));

    }
}
