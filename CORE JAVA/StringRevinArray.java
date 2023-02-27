import java.util.*;
public class StringRevinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        String[] arrout = new String[n];
        System.out.println("Enetr Values");
        sc.nextLine();
        for(int k = 0; k<arr.length; k++)
        {
            arr[k] = sc.nextLine();
        }
        for(int i = 0; i<arr.length; i++)
        {
            String rev = "";
            String s = arr[i];
            for(int j=s.length()-1; j>=0; j--)
            {
                char ch = s.charAt(j);
                rev = rev + ch;
            }
            arrout[i] = rev;
        }
        System.out.println("Original: "+ Arrays.toString(arr));
        System.out.println("Reversed: "+ Arrays.toString(arrout));
     }
}
