
import java.util.Arrays;

/*
 ex:- {5, 3, 4, 1, 2}
 In this alogrithm:
 1st we will compare 0 and 1 index and swap if i+1 i.e. j < i
 likewise, we'll compare from 0 to 2, and perform swap, if required
 Then, form 0 to 3,
 and finally from 0 to 4
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr)
    {
        // This loop will work from 0  to n-2, since j is working from i+1
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i+1; j > 0; j--)
            {
                if(arr[j-1] > arr[j])
                {
                    SwapValues(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void SwapValues(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
