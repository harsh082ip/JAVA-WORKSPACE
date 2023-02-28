// Search for an Element In a Bitonic or Mountain array

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 4, 3, 2, 1};
        int target = 8;
        System.out.println(finalResult(arr, target));
    }
    static int finalResult(int[] arr, int target)
    {
        
        int peak = peakElement(arr, target);
        int isElementPresent = OrderAgnosticBinarySearch(arr, target, 0, peak);
        if(isElementPresent != -1)
        {
            return isElementPresent;
        }
        else{
            return OrderAgnosticBinarySearch(arr, peak, peak+1, arr.length-1);
        }
    }

    static int peakElement(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start < end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid+1] > arr[mid])
            {
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

    static int OrderAgnosticBinarySearch(int arr[], int x , int start, int end)
    {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] == x)
                return x;
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
