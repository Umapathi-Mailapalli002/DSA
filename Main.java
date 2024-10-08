
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //int n = sc.nextInt();

        // for (int i = 2; i*i < n; i++) {
           
        //         if (n % i == 0) {
        //             System.out.println(n + " is not a prime number");
        //             break;
        //         }else{
        //             System.out.println(n + " is a prime number");
        //         }
      
        // }

        // find the charecter lowercase or uppercase

        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }
    }
}
