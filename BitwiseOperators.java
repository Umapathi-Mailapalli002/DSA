public class BitwiseOperators {
    //swaping of two numbers using bitwise operators
    static void swapMethod3(int a, int b){
        //without using temporary variable
        //through the bitwise operators
        //for a = 3 => 0011
        //for b = 5 => 0101
        //then a = a^b =   0110
        //then b = 0101 so 0101
        //                 0011
        //then we got the b = 3;
        //then again a = 0110 
        // then a = a^b = 0110^0011 => 0101 => 5
        //so it swaped
        a = a^b;  
        b = a^b;
        a = a^b;
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
    }
    public static void main(String[] args) {
        //H.M
        System.out.println( 6 & 10);
        System.out.println( 6 | 10);
        System.out.println( 6 ^ 10);

        //bitwise operators
        // left shift << ex:- 2<<10 => 1010 => 101000 then ans is 40
        //right shift >> ex:- 10>>2 => 1010 => 0101 then its ans is 5
        System.out.println(10 << 2); //we can find with a formula also a*2^b
        System.out.println(10 >> 2); //we can find with a formula also a/2^b
        //HM
        System.out.println(10 >> 1);
    }
}
