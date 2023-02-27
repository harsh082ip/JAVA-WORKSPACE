import java.util.*;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number To Reverse: ");
        int x=sc.nextInt();
        int rev=0;
        int n=x;
        while(x!=0)
        {
            int d=x%10;
            rev=(rev*10)+d;
            x/=10;
        }
        if(n==rev)
        {
            System.out.println(rev+" is a pallindrome no.");
        }
        else{
            System.out.println(rev+" is not a pallindrome no.");
        }
    }
}
