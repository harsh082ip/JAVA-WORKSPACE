public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {16, 15, 14, 13, 12, 11, 10, 6, 5, 4, 3, 2, 1};
        int x = 11; // Target Element
        System.out.println(binarySearch(arr, x));
    }

    static int binarySearch(int arr[], int x)
{
    int start = 0;
    int end = arr.length-1;
    // Checking the sorted order of the given array
    boolean isAsc = arr[start] < arr[end];
    while (start <= end) {
        int middle = start + (end - start) / 2;
 
        // Check if x is present at mid
        if (arr[middle] == x)
            return x;
 
        // Ascending order
        if (isAsc == true) {
 
            // If x greater, ignore left half
            if (arr[middle] < x)
                start = middle + 1;
 
            // If x smaller, ignore right half
            else
                end = middle - 1;
        }
 
        // Descending order
        else {
 
            // If x smaller, ignore left half
            if (arr[middle] > x)
                start = middle + 1;
 
            // If x greater, ignore right half
            else
                end = middle - 1;
        }
    }
 
    // Element is not present
    return -1;
}
}
