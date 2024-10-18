
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


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x = sc.nextDouble();
        //System.out.println(calPower(x, n));
        System.out.println(myPow(x, n));
    }
}
