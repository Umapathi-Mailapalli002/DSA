public class Recap {
    static int decimal2binary(int num) {
        int n = 0;
        int pw = 1;
        while (num > 0) { 
            int lastDigit = num%2;
            n += lastDigit * pw;
            num /= 2;
            pw*=10;
        }
        return n;
    }
    static  int binary2Decimal(int num){
        int decimalNum = 0;
        int pw = 1;
        while (num > 0) { 
            int lastDigit = num % 10;
            decimalNum += lastDigit * pw;
            num/=10;
            pw*=2;
        }
        return  decimalNum;
    }
    static int findTargetElement(int[] arr, int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end- start)/2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            }
            else if (arr[mid] > target) {
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return  ans;
    }

    static int findTargetElementRotatedArray(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target) {
                return  mid;
            }else if (target <= arr[mid] ) {
                if (target > arr[start] && target <= arr[mid]) {
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(decimal2binary(10));
        System.out.println(binary2Decimal(1010));
    }
}
