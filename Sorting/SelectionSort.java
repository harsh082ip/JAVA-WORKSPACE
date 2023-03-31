
import java.util.Arrays;
/*
 first we will find the largest element and then swap it with its corret Index
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 3, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int last = arr.length - i -1;
            int maxIndex = MaxIndex(arr, 0, last);
            SwapValues(arr, maxIndex, last);
        }
    }
      static void SwapValues(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
    static int MaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start; i<=end; i++)
        {
            if(arr[i] > arr[max])
            {
                max = i;
            }
        }
        return max;
    }
}
