public class BitwiseOperators {
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
