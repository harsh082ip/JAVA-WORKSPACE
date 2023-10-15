import java.util.*;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number you want to check is palindome or not  ");
        int x=sc.nextInt();
        int rev=0;
        int n=x;
        while(x!=0)
        {
            int d=x%10;
            rev=(rev*10)+d;
            x/=10;
        }
        if(n==rev){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindome");
        }
       
    }
}