
public class test232 {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,3,2,1};
 int ans= searchrange(arr);
 System.out.print(ans);
    }
   static  int searchrange (int arr[] ){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
        if(arr[mid]>arr[mid+1]&& arr[mid]>arr[mid-1]){
            return mid;
        }
        if(arr[mid]<arr[mid+1]){
            start= mid+1;
        }
        else if(arr[mid]<arr[mid-1]){
            end= mid-1;
        }
        else {
            return mid;
        }
    
    }    
    return -1;
    }
    
}