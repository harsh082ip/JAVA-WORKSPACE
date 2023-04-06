// https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/
public class checkIfTheArrayisSorted {
    public static void main(String[] args) {
        int[] arr = {12, 16, 18, 19, 25, 30, 35, 40};
        issorted(arr, 0, 0);
    }
    static void issorted(int[] arr, int i, int count)
    {
       if(i == arr.length - 1)
        {
            if(count == 0)
            {
                System.out.println("Sorted");
                return;
            }
            else{
                System.out.println("Not Sorted");
                return;
            }
        }
        // ! i<arr.length
        if(i < arr.length && arr[i] > arr[i+1])
        {
            count++;
        }
        issorted(arr, ++i, count);
    }
}