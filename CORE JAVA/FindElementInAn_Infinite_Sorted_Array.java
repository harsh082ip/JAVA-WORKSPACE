// link:- https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// Infinite Array Means we cannot use .length() function
// We will solve this problem in Chunks & we'll keep doubling the chunk size

public class FindElementInAn_Infinite_Sorted_Array
{
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8,9,11,12,13,14,15,17,19,21,22,24,25,26,27,28,29,30,31,32};
        int target = 19;
        System.out.println(StartAndEnd(arr, target));
    }
    static int StartAndEnd(int arr[], int target)
    {
        int start = 0;
        int end =1;
        while(target > arr[end])
        {
            int temp = end + 1; // will be our new Start
            end = end + (end - start + 1) * 2; // Dry Run
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end)
    {
        while(start <= end)
        {
            int mid = start + (end - start) / 2; // Similar as (start + end)/2;
            if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else if(arr[mid] > target)
            {
                end = mid - 1;
            }
            else{
                int res = arr[mid];
                return res;
            }
        }
        return -1;
    }
}