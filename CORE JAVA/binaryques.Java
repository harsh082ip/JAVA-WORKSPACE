import java.util.*;
public class binaryques {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print(arr[n]);
        int s=0;
        int e=arr.length-1;
        if(arr[s]<arr[e]){
            System.out.print("Ascending order");
        }
        else{
            System.out.print("Descending order");
        }
    }
    
}