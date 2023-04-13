public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr  = {1, 3, 5, 6, 7};
        System.out.println(SortedOrNot(arr, 0));
    }
    static boolean SortedOrNot(int[] arr, int i)
    {
        if(i == arr.length-1)
        {
            return true;
        }
        return arr[i] < arr[i+1] && SortedOrNot(arr, ++i);

    }
}
