import java.util.*;
public class arr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i<arr.length-1; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i<arr.length-1; i++)
        {
            System.out.print(arr[i] + " ");
        }
        int[] sum = new int[arr.length];
        int s = 0;
        for(int j = 0; j<arr.length; j++)
        {
            s = s+arr[j];
            sum[j] = s;
        }
        sum = sum + sum;
        System.out.println(Arrays.toString(sum));
    }
}
