
import java.util.Arrays;
import java.util.Scanner;
public class ArraysTopic {
    //print array
static void printArray(int[] arr){
    for (int i = 0 ; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
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
            if (arr[j] == arr[i]) {
                arr[i] = -1;
                arr[j] = -1;  
            }
        }
        
    }
    for (int i = 0; i < size; i++) {
        if (arr[i] > 0) {
           System.out.print(arr[i]+ " "); 
        }
    }
}

//print all the unique values in an array
static  void intersectionOfArrays(int[] arr_1, int[] arr_2, int size_1, int size_2){
    
    for (int i = 0; i < size_1; i++) {
        for (int j = 0; j < size_2; j++) {
            if (arr_1[i] == arr_2[j]) {
                System.out.print(arr_2[j]+ " ");
            }
        }
    }
}

//some problems on arrays

//find the occurance of a number
static int countNumberOfOcurrance(int[] arr, int size, int target){
    int count = 0;
    for (int i = 0; i < size; i++) {
        if(arr[i] == target){
            count++;
        }
    }
    return count;

}

//find the last occurrence of element x
static int lastOccurrence(int[] arr, int size, int target){
    int lastOccurrenceIndex = 0;

    for (int i = 0; i < size; i++) {
        if (arr[i] == target) {
            lastOccurrenceIndex = i;
        }
    }
    return  lastOccurrenceIndex;
}

//check is it sorted or not
static void isSorted(int[] arr, int size){
    boolean check = true;
    for (int i = 1; i < size; i++) {
        if (arr[i-1] > arr[i]) {
            check = false;
            break
            ;
        }
    }
    if (check) {
        System.out.println("is sorted");
    }else{
        System.out.println("is not sorted");
    }
}

//leetcode Single number problem
static int singleNumber(int[] num){
    int start = 0;
    int end = num.length-1;
    while (start < end) { 
        if(num[start] != num[end]){
            start++;
        }else{
            num[start] = 0;
            num[end] = 0;
            end--;
            start = 0;
        }

    }
int ans = 0;
    for (int i = 0; i < num.length; i++) {
        if (num[i] > 0) {
            ans = num[i];
        }
    }
    return ans;
}
//alternate methode to solve in leetcode in linear way
static int singleNumber2(int[] num){
    int ans = 0;
    //this is simply done with exor
    for (int i = 0; i < num.length; i++) {
        ans ^= num[i];
    }
    return ans;
}
//target sum of array elements of pairs 
static void targetSumOfPairs(int[] arr, int target){
    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if (arr[i] + arr[j] == target) {
                System.out.println(arr[i]+","+arr[j]);
            }
        }
    }
}
//optimised opproch
static void targetSumOfPairsOptimizedWay(int[] arr, int target){
    int start = 0;
    int end = arr.length-1;
    while (start < end) {
        int pairSum = arr[start] +arr[end];
        if (pairSum > target) {
            end--;
        }else if (pairSum < target) {
            start++;
        }else{
            System.out.println(start+","+end);
        }
    }
}

//triples whose sum is equal to the target number
static void targetSumOfTriples(int[] arr, int target){
    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            for (int j2 = j+1; j2 < arr.length; j2++) {
                if (arr[i] + arr[j] + arr[j2] == target) {
                    System.out.println(arr[i]+","+arr[j]+","+arr[j2]);
                }
            }
        }
    }
}

//find the second max in an array
static int max(int[] arr){
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    
    return max;
}
static int secondMax(int[] arr){
    int mx = max(arr);

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == mx) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    int secondmx = max(arr);
    
    return secondmx;
}
//bruteforce solution of maximum subarray sum
static void maxSubArray(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        for (int j = i; j < arr.length; j++) {
            for (int j2 = i; j2 < j; j2++) {
                System.out.print(arr[j2]);
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}

//improve the bruteforce
static int maxSubArray2(int[] arr){
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        int currSum =0;
        for (int j = 0; j < arr.length; j++) {
            currSum += arr[j];
            maxSum = Math.max(currSum, maxSum);
        }
    }
    return  maxSum;
}

//kadane's Algorithm
// most optimised
static int maxSubArr(int[] arr){
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    for (int values : arr) {
        currSum += arr[values];
        maxSum = Math.max(currSum, maxSum);
        if (currSum < 0) {
            currSum = 0;
        }
    }
    return maxSum;
}


//majority element through bruteforce methode
static int majorityElementBruteforce(int[] arr){
    /* for (int i = 0; i < arr.length; i++) {
        int freq = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                freq++;
            }
        }
        if (freq > arr.length/2) {
            return  arr[i];
        }
    } */
   // we can also use foreach loop
   for (int val : arr) {
    int freq = 0;
    for (int el : arr) {
        if (el == val) {
            freq++;
        }
    }
    if (freq > arr.length/2) {
        return  val;
    }
   }
   return -1; 
}
//optimized approach
static  int majorityElementoptimize(int[] arr){
    if (arr.length == 1) return arr[0];
    //sort the given array
    Arrays.sort(arr);
    int freq = 1;
   for (int i = 1; i < arr.length; i++) {
    if (arr[i-1] == arr[i]) {
        freq++;
    }else{
        freq = 1;
    }
    if (freq > arr.length/2) {
        return arr[i];
    }
   }
   return -1;
}
//moore's voting alogorithm
static int majorityElementMooresMethod(int[] arr){
    int freq = 0; 
    int ans = 0;
    for (int index = 0; index < arr.length; index++) {
        if (freq == 0) {
            ans = arr[index];
        }
        //checking the current element
        if (ans == arr[index]) {
            freq++;
        }else{
            freq--;
        }
    }
    return ans;
}

//first repeating value return
static int firstRepeatingValue(int[] arr){
    int ans = 0;
    int freq = 0;
    //i think it is done with moores's algorithm
    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
          if (arr[i] == arr[j]) {
            return  arr[i];
          }  
        }
    }
    return -1;
    
}

//swap in another two different ways
static void swapMethod2(int a, int b){
    //without using temporary variable
    a = a+b;
    b = a-b;
    a = a-b;
    System.out.println("a is: "+a);
    System.out.println("b is: "+b);
}
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

//reversing array with extra space means by using extra array
static int[] revArrayWithExtraSpace(int[] arr){
    int[] ans = new int[arr.length];
    int j = 0;
    for (int i = arr.length-1; i >= 0; i--) {
        ans[j++] = arr[i];
    }
    printArray(ans);
    return ans;
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = sc.nextInt();
            
         }
        // int target = sc.nextInt();
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

   // printUniqueValues(arr, size);
//    int[] arr1 = new int[5];
//   arr1[0] = 1;
//   arr1[1] = 2;
//   arr1[2] = 3;
//   arr1[3] = 4;
//   arr1[4] = 5;
//    int[] arr2 = new int[4];
//   arr2[0] = 6;
//   arr2[1] = 7;
//   arr2[2] = 3;
//   arr2[3] = 1;

   //intersectionOfArrays(arr1, arr2, 5, 4);
   //System.out.println(countNumberOfOcurrance(arr, size, target));
   //System.out.println(lastOccurrence(arr, size, target));
  // isSorted(arr, size);
//   System.out.println(singleNumber(arr));
//   System.out.println("single number which is unique is: "+singleNumber2(arr));
//targetSumOfPairs(arr, target);
        // targetSumOfTriples(arr, target);
       //System.out.println(secondMax(arr));
      // maxSubArray(arr);
      //System.out.println(maxSubArray2(arr));
     // System.out.println(maxSubArr(arr));
  //targetSumOfPairsOptimizedWay(arr, target);
  //System.out.println(majorityElementBruteforce(arr));
  //System.out.println(majorityElementoptimize(arr));
 // System.out.println(majorityElementMooresMethod(arr));
 //System.out.println("the first repeated values is: "+firstRepeatingValue(arr));
 //swapMethod3(3,5);
revArrayWithExtraSpace(arr);
int[] rev = revArrayWithExtraSpace(arr);
System.out.println(Arrays.toString(rev));
}
    
    
    
}
