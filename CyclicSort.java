import java.util.Arrays;

/*
 Cyclic Sort Will only work for 1 to N "continuous elements"
 Array will be Sorted in just 1 pass
 here, the correct Index of an Element is equal to ---> element - 1
 ex:- the element is 3,  so it's correct Index will be 3-1 i.e. 2
 We'll keep Swaping with the Correct Indexes
 */
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2, 6, 5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int CorrectIndex = arr[i] - 1;
            if(arr[i] != arr[CorrectIndex])
            {
                SwapValues(arr, i, CorrectIndex);
            }
            else{
                i++;
            }
        }
    }
    static void SwapValues(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

