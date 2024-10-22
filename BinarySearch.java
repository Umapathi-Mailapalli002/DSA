import java.util.*;
public class BinarySearch {
    //to find target element it is more effient then recursive approach because 
    //in this the time complexity is O(log n) and space complexity is O(1)
    static int findTargetElement(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start <= end) {
            // int mid = (start+end)/2; 
            //optimized one to save from the overflow in big intigers case
            int mid = start + (end - start)/2;
            if (target == arr[mid]) {
                ans = mid;
                break;
            }else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
    //through recursive way
    //time complexity is O(log n) and space complexity is O(log n)
    static int findTargetElementRecursiveWay(int[] arr, int target, int start, int end){
        int ans = -1;
        if (start <= end) {
            int mid = start + (end - start)/2;
            if (target == arr[mid]) {
                ans = mid;
            }else if (target > arr[mid]) {
               return findTargetElementRecursiveWay(arr, target, mid+1, end);
            }else{
               return findTargetElementRecursiveWay(arr, target, start, mid-1);
            }
        }
        return ans;
    }


    //seach in rotated Sorted array through binary search
    static int findTargetElementRotatedArray(int[] arr, int target){
       int start = 0;
       int end = arr.length-1;
       while (start <= end) { 
        int mid = start + (end - start)/2;
     //first we have to check the rotated array in which part of array is sorted
     //left or right
     if (arr[mid] == target) {
        return mid;
     }
        else if(arr[start] <= arr[mid]) {
            if (target > arr[start] && target <= arr[mid]) {
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }else{
            if (target > arr[mid] && target <= arr[end]) {
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }
    }
// this is also same but reverse check 
    /* while (start <= end) {
        int mid = start + (end - start) / 2;
        // first we have to check the rotated array in which part of array is sorted
        // left or right
        if (arr[mid] == target) {
            return  mid;
        } else if (arr[start] <= arr[mid]) {
            if (arr[start] <= target && target <= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else {
            if (arr[mid] <= target && target <= arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    } */
    return -1;
    }
    public static void main(String[] args) {
        // binary serch is only used in sorted array
        // from increasing or decreasing

        Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
        int[] arr = new int[size];

        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = sc.nextInt();

        }
       int target = sc.nextInt();

       // System.out.println(findTargetElement(arr, target));
       //System.out.println(findTargetElementRecursiveWay(arr, target, 0, size-1));
       System.out.println(findTargetElementRotatedArray(arr, target));
    }
}
