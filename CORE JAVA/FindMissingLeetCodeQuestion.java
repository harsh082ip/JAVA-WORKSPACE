// https://leetcode.com/problems/missing-number/
// Task: Find the Missing no
//{4, 3 ,2,}
public class FindMissingLeetCodeQuestion {
    public static void main(String[] args) {
        int[] arr = {5, 3, 0, 1};
        int MissingValue = cyclicSort(arr);
        System.out.println(MissingValue);
    }
    static int cyclicSort(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int CorrectIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[CorrectIndex])
            {
                SwapValues(arr, i, CorrectIndex);
            }
            else{
                i++;
            }
        }
        //Search for the Missing Element
        for(int j = 0; j < arr.length ; j++)
        {
            if(arr[j] != j)
            {
                return j;
            }
        }
        return arr.length;
    }
    static void SwapValues(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
