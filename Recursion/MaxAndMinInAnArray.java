// https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
public class MaxAndMinInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        int max = Max(arr, 0, arr[0]);
        int min = Min(arr, 0, arr[0]);
        System.out.println("min = " + min + " max = " + max);
    }
    static int Max(int[] arr, int i, int max)
    {
        if(arr[i] > max)
        {
            max = arr[i];
        }
        i++;
        if(i == arr.length)
        {
            return max;
        }
        return Max(arr, i, max);
    }
    static int Min(int[] arr, int i, int min)
    {
        if(arr[i] < min)
        {
            min = arr[i];
        }
        i++;
        if(i == arr.length)
        {
            return min;
        }
        return Min(arr, i, min);
    }
}
