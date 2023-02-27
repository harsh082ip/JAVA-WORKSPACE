import java.util.Arrays;
import java.util.Scanner;

public class trim1 {
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int s=0;
        int e=arr.length-1;
        int c = 0;
        if(arr[s]<arr[e]){
            System.out.println("Ascending order");
            c = 1;
        }
        else{
            System.out.println("Descending order");
        }
        System.out.println("Enter Target Element: ");
        int x = sc.nextInt();
        int result;
        if(c == 1)
        {
             result = ascendingbinarySearch(arr, x);
        }
        else{
             result = descendingbinarySearch(arr, x);
        }
        if(result == x)
        {
            System.out.println("Element Found");
        }
        else
        {
            System.out.println("Elememt Not Found :/");
        }
    }
    
    static int ascendingbinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return -1;
    }
    static int descendingbinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return -1;
    }

    
}