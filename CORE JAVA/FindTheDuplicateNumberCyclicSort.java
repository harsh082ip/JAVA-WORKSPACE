public class FindTheDuplicateNumberCyclicSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        int duplicateValue = DuplicateElement(arr);
        System.out.println(duplicateValue);
    }
    static int DuplicateElement(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            if(arr[i] != i+1) 
        {
            int CorrectIndex = arr[i] - 1;
            if(arr[i] != arr[CorrectIndex]) 
            {
                SwapValues(arr, i, CorrectIndex);
            }
            else{
                return arr[i];
            }
        }
        else{
            i++;
        }
            
        }
        return -1;
    }
    static void SwapValues(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
