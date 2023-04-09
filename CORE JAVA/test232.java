
public class test232 {
    public static void main(String[] args) {
        int []arr= {1, 2, 40, 6, 7, 9 ,10};
        int l= arr.length;
        int max=arr[0];
        //int min=arr[0];
        System.out.print(maxno(arr, max, l, 1));
    }
 static int maxno(int[]arr, int max, int l , int i){
        if(i==l){
            return max;
        }
        if(max<arr[i]){
            max= arr[i];
        }
        return maxno(arr, max, l, ++i);
 }
    
}