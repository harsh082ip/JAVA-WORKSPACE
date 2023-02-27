import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number To Reverse: ");
        int x=sc.nextInt();
        int rev=0;
        while(x!=0){
            int d=x%10;
            rev=(rev*10)+d;
            x/=10;
        }
        System.out.println("Reverse of the Entered Number is: "+rev);
    }
}
