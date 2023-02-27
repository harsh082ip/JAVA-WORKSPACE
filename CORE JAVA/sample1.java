import java.util.*;
public class sample1 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr));
    }
    static int sum(int[] arr1)
    {
        int s =0;
        for(int i=0; i<arr1.length; i++)
        {
            s = s+arr1[i];
        }
        return s;
    }
    static String sum(String s)
    {
        String res = "";
        for(int i=0; i<s.length(); i++)
        {
            res = res + s.charAt(i);
        }
        return res;
    }
}
