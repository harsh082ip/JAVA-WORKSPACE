import java.util.*;
public class arrtut1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
    
        //input
         for(int j=0; j<arr.length; j++)
         {
            arr[j]= sc.nextInt();
         }
         //output
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");
            
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
