import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(mergesort(arr)));
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr)
    {
        // base cond.
        if(arr.length == 1)
        {
            return arr;
        }
        int mid = arr.length/2;
        // Here mid is exclusive
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    private static int[] merge(int[] first, int[] second) {
        int mix[] = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j<second.length)
        {
            if(first[i] < second[j])
            {
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length)
        {
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length)
        {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}



// In place explaination
/*
 Let's take the input array to be [5, 3, 8, 6, 2, 7, 1, 4].

We start by calling mergeSortInPlace(arr, 0, arr.length) with the entire input array and the start and end indices.

mergeSortInPlace([5, 3, 8, 6, 2, 7, 1, 4], 0, 8)
Since the length of the array is greater than 1, we calculate the middle index: mid = (0 + 8) / 2 = 4.
We then recursively call mergeSortInPlace on the left half of the array ([5, 3, 8, 6]) and the right half of the array ([2, 7, 1, 4]).
Calling mergeSortInPlace([5, 3, 8, 6], 0, 4):
Since the length of the array is greater than 1, we calculate the middle index: mid = (0 + 4) / 2 = 2.
We then recursively call mergeSortInPlace on the left half of the array ([5, 3]) and the right half of the array ([8, 6]).
Calling mergeSortInPlace([5, 3], 0, 2):
Since the length of the array is greater than 1, we calculate the middle index: mid = (0 + 2) / 2 = 1.
We then recursively call mergeSortInPlace on the left half of the array ([5]) and the right half of the array ([3]).
The length of the array is 1, so we return without doing anything.
We then recursively call mergeSortInPlace on the right half of the array ([3]).
The length of the array is 1, so we return without doing anything.
We now call mergeInPlace to merge the sorted left and right halves: mergeInPlace([5, 3], 0, 1, 2)
We create a temporary array mix of length 2 to store the merged elements: mix = [0, 0].
We initialize indices i, j, and k to 0, 1, and 0, respectively.
Since arr[i] < arr[j], we copy arr[i] into mix[k] and increment i and k: mix = [3, 0], i = 1, k = 1.
Since i < m, we copy the remaining elements from the left half into mix: mix = [3, 5].
We then copy the elements from mix back into arr starting at index s (which is 0): arr = [3, 5, 8, 6].
We now call mergeSortInPlace on the right half of the array ([8, 6]).
Since the length of the array is
 */