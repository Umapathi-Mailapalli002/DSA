
import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        //pattern 1
        // 1234
        // 1234
        // 1234
        // 1234
        int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }

        //in this pattern to print the charecters
        // for (int i = 0; i < n; i++) {
        //     char ch = 97;
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(ch++);
        //     }
        //     System.out.println("");
        // }
        

        //pattern 2
        // 123
        // 456
        // 789
        // int num = 1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j<=n ; j++) {
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println("");
        // }

        //H.M problem
        //ABC
        //DEF
        //GHI

        // char ch = 65;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(ch);
        //         ch++;
        //     }

        //     System.out.println();
        // }


        //pattern 3 triangle pattern
        //*
        //**
        //***
        //****
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //pattern 4
        //1
        //22
        //333
        //4444
        // for (int i = 0; i < n; i++) {
        //         for (int j = 0; j < i+1; j++) {
        //             System.out.print(i+1);
        //         }
        //         System.out.println();
        //     }

        //same pattern with alphabats

        // char ch = 65;
        // for (int i = 0; i < n; i++) {
            
        //     for (int j = 0; j < i+1; j++) {
        //         System.out.print(ch);
        //     }
        //     System.out.println();
        //     ch++;
            
        // }

        //pattern 3
        //1
        //12
        //123
        //1234
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < i+1; j++) {
        //         System.out.print(j+1);
        //     }
        //     System.out.println();
        // }

        //reverse number pattern like the above one
        //1
        //21
        //321
        //4321
        // for (int i = 0; i < n; i++) {
        //     for (int j = i+1; j > 0; j--) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        //for alphabats

        char ch = 65;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j > 0; j--) {
                System.out.print(" ");
                
            }
            System.out.println(ch);
           
        }


        //floyd's triangle pattern 
        //1
        //23
        //456
        //78910
        //int num = 1;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < i+1; j++) {
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println();
        // }
        //alternate methode
        // for (int i = 0; i < n; i++) {
        //     for (int j = i+1; j > 0; j--) {
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println();
        // }
        //another methode
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < i+1; j++) {
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println();
        // }
        // char ch = 65;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < i+1; j++) {
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
    }
}
