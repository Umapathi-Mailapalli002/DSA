public class TimeAndSpaceComplexity {
    public static void main(String[] args) {

        //Time complexity

        //Big 0 notation this is the worst case of complexity
        //it is also called upperbound
        // O(n) 
        //and if we get the time complexity of a fucntion like this 
        //4n^2 + 3n + 5;
        //then we should ignor the small and neglisible values like 
        //in this case we ignor the constants like 4 + 3 + 5
        //these are the constants then the remaining part like n^2 + n + 1 is remaining
        //then also ignore the small terms and neglisible values n < n^2 so n is neglisible
        //then we get the time complexity O(n^2);
        //some time complexities from decrease order from wrost ot best
        //O(n!) > O(2^n) > O(n^3) > O(n^2) > O(n log n) > O(n) > O(log n) > O(1)
        //common Time complexities
        //O(1)
        //O(n) => linear ex:- moore's algorithm
        //O(n^2) & O(n^3) => Bubble sort, selection sort and insertion sort is O(n^2) and the in subsarrays problem there are three loops so it is O(n^3)
        //O(log n) =>ex:- binary search
        //O(n log n) => ex:- optimized sorting algorithms like merge sort, quick sort and greedy algorithms
        //O(2^n) => ex:- in recursion

        //Space complexity

        //it is nothing but the auxilary/extraspace is used to perform the
        //algoritm and the space complexity is also depend on the input 
        //like for example you have a question in which you given an array
        //you print the square of each element of array in a new array
        //then created new array is called auxilary space then space is
        // directly depend on the size which the user input in the original array
        //so, the space complexity is the same we get O(n) => because n spaces is required to store the squares
    }
}
