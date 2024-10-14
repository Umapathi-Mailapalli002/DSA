
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

    //to print only index
    static void smallAndLargestArrayIndex(int[] arr, int size){
        int maxIndex = Integer.MIN_VALUE;
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxIndex) {
                maxIndex = i;
            }
            if (arr[i] < minIndex) {
                minIndex = i;
            }
        }
        System.out.println("max element index is: "+maxIndex);
        System.out.println("min element index is: "+minIndex);
    }

    //Linear search
    static int linearSearch(int[] arr, int size, int target){
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                System.out.println("target found at index: "+i);
                index = i;
            }
        }
        return index;
    }

    //reverse an array methode 1
    static void revArray(int[] arr, int size){
        for (int i = size-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }

   // Swap elements at the specified indices in the array
static void swap(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}

// Reverse the array
static void revArrayMethod2(int[] arr, int size) {
    int start = 0;
    int end = size - 1;
    while (start < end) { 
        swap(arr, start, end); // Use the indices of the array
        start++;
        end--;
    }
}

//write a function to calculate sum & prodect of all numbers in an array
static void sumAndProductOfArray(int[] arr, int size){
    int sum = 0;
    int product = 1;
    for (int i = 0; i < size; i++) {
        sum += arr[i];
        product *= arr[i];
    }
    System.out.println("sum of all element is array is :"+ sum);
    System.out.println("product of all element is array is :"+ product);
}

//swap the max and min number of array
static void swapMaxAndMinOfArray(int[] arr, int size){
    int maxIndex = Integer.MIN_VALUE;
    int minIndex = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > maxIndex) {
            maxIndex = i;
        }
        if (arr[i] < minIndex) {
            minIndex = i;
        }
    }
        swap(arr, maxIndex, minIndex);
        
}

//print all the unique values in an array
static void printUniqueValues(int[] arr, int size){
    for (int i = 0; i < size; i++) {
        for (int j = i+1; j < size; j++) {
            if (arr[j] != arr[i]) {
                System.out.print(arr[i]+" ");
                
            }
        }
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = sc.nextInt();
            
        }
        //int target = sc.nextInt();
        //smallAndLargestArray(arr, size);
       // smallAndLargestArrayIndex(arr, size);
       //System.out.println(linearSearch(arr, size, target));
      // revArray(arr, size);
      
    //   revArrayMethod2(arr, size);
    //   //swap(3, 2);
    //   for (int i = 0; i < size; i++) {
    //     System.out.print(arr[i]+" ");
    //}
    //sumAndProductOfArray(arr, size);

    // swapMaxAndMinOfArray(arr, size);
    // for (int i = 0; i < size; i++) {
    //         System.out.print(arr[i]+" ");
    //     }
    // }

    printUniqueValues(arr, size);
    }
    
    
    
}
