// Search for an Element In a Bitonic or Mountain array

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 4, 3, 2, 1};
        int target = 7;
        System.out.println(finalResult(arr, target));
    }
    static int finalResult(int[] arr, int target)
    {
        
        int peak = peak_binarySearch(arr);
        int isElementPresent = OrderAgnosticBinarySearch(arr, target, 0, peak);
        if(isElementPresent != -1)
        {
            return isElementPresent;
        }
        else{
            return OrderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
        }
    }

    // static int peakElement(int[] arr, int target)
    // {
    //     int start = 0;
    //     int end = arr.length-1;
    //     while(start < end)
    //     {
    //         int mid = start + (end - start) / 2;
    //         if(arr[mid+1] > arr[mid])
    //         {
    //             start = mid + 1;
    //         }
    //         else{
    //             end = mid;
    //         }
    //     }
    //     return start;
    // }
    static int peak_binarySearch(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start <= end)
        {
            int mid = start + (end-start) / 2;
            if(arr[mid]> arr[mid+1] && arr[mid] > arr[mid-1])
            {
                int res = arr[mid];
                return res;
            }
            if(arr[mid+1] > arr[mid])
            {
                start = mid + 1;
            }
            else if(arr[mid+1] < arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                int res = arr[mid];
                return res;
            }
        }
        return -1;
    }

    static int OrderAgnosticBinarySearch(int arr[], int x , int start, int end)
    {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] == x)
                return x; // x is target
            if (isAsc == true) {
                if (arr[middle] < x)
                    start = middle + 1;
                else
                    end = middle - 1;
            }
            else {
                if (arr[middle] > x)
                    start = middle + 1;
                else
                    end = middle - 1;
            }
        }
        return -1;
    }
}
