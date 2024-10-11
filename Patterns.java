
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
        /* for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

        in this pattern to print the charecters
        for (int i = 0; i < n; i++) {
            char ch = 97;
            for (int j = 0; j < n; j++) {
                System.out.print(ch++);
            }
            System.out.println("");
        } */
        

        //pattern 2
        // 123
        // 456
        // 789
       /*  int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=n ; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println("");
        }

        //H.M problem
        //ABC
        //DEF
        //GHI

        char ch = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        } */


        //pattern 3 triangle pattern
        //*
        //**
        //***
        //****
        /* for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        } */

        //pattern 4
        //1
        //22
        //333
        //4444
        /*
         for (int i = 0; i < n; i++) {
                for (int j = 0; j < i+1; j++) {
                    System.out.print(i+1);
                }
                System.out.println();
            }

        //same pattern with alphabats

        char ch = 65;
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < i+1; j++) {
                System.out.print(ch);
            }
            System.out.println();
            ch++;
            
        } 
            */

        //pattern 3
        //1
        //12
        //123
        //1234
  /*       for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }

        //reverse number pattern like the above one
        //1
        //21
        //321
        //4321
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        //for alphabats H.W
        int ch = 65;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j > 0; j--) {
                System.out.print((char)(ch+j-1));
                
            }
            System.out.println();
           
        }
 */

        //floyd's triangle pattern 
        //1
        //23
        //456
        //78910
  /*       int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
        //alternate methode
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j > 0; j--) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
        //another methode
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
        //for aphabets
        char ch = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        } */


        //pattern 5 Inverted Triangle Pattern
        //1111
        // 222
        //  33
        //   4
/*         for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n-i; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }

        //for alphabets
        char ch = 65;
        for (int i = 0; i < n; i++) {
            //print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //print pattern
            for (int j = 0; j < n-i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
 */

        //pattern 6 pyramid pattern
        //    1
        //   121
        //  12321
        // 1234321

        /* for (int i = 0; i < n; i++) {

            //spaces
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            //from 1 to 4 numbers first
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1);
            }

            //print remaining numbers
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
 */

        //pattern 7 Hollow Diamond Pattern
        //   *
        //  * *
        // *   *
        //*     *
        // *   *
        //  * *
        //   *
        //for upper triangle
        //   *
        //  * *
        // *   *
        //*     *
        /* for (int i = 0; i < n; i++) {
            //print spaces
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            //print the first line stars
            System.out.print("*");

            //remaing side spaces and stars
            if (i != 0) {
                for (int j = 0; j < i*2-1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        //remaining down part
         // *   *
        //   * *
       //     *
       for (int i = 0; i < n-1; i++) {
           for (int j = 0; j < i+1; j++) {
               System.out.print(" ");
           }
           System.out.print("*");

           if (i != n-2) {
            for (int j = 0; j < n-i*2-1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
           }
           System.out.println();
       }
 */

   /*  //Butterfyl Pattern
        //*      *
        //**    **
        //***  ***
        //********
        //********
        //***  ***
        //**    **
        //*      *

        //first part
        //*      *
        //**    **
        //***  ***
        //********
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n+2-i*2 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
       //second part 
        //********
        //***  ***
        //**    **
        //*      *
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
               System.out.print("*"); 
            }
            for (int j = 0; j < i*2 ; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("*"); 
             }
             System.out.println();
        }
         */
    }
}
