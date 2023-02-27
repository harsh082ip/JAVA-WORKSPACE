import java.util.*;
public class counting_occurrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check Occurrence");
        int n=sc.nextInt();
        System.out.println("which no?");
        int x=sc.nextInt();
        int s=n;
        int count=0;
        while(n!=0)
        {
            int d=n%10;
            if(d==x)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println(x+" occurred in "+s+", "+count+" times");
    }
}
