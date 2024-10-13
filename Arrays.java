
import java.util.Scanner;

public class Arrays {
    static void  smallAndLargestArray(int[] arr, int size){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        if (size <= 0) {
            System.out.println("array is empty ");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            
        }
        System.out.println("max array is: "+ max);
        System.out.println("min array is: "+ min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = sc.nextInt();
            
        }
        smallAndLargestArray(arr, size);
    }
}
