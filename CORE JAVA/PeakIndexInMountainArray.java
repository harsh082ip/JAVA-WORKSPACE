public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 4, 3, 2};
        System.out.println(peak_binarySearch(arr));
    }
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
}
