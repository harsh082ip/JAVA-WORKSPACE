import java.util.*;
public class stringinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        sc.nextLine();
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(arr));
    }
}
