import java.util.*;
public class largestof3numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Numbr 1: ");
        int a =sc.nextInt();
        System.out.println("Number 2: ");
        int b=sc.nextInt();
        System.out.println("Number 3:");
        int c=sc.nextInt();
        int max=a;
        if(b>a)
        {
            max=b;
        }
        if(c>a)
        {
            max=c;

        }
        System.out.println("Largest No is "+ max);
    }
}
