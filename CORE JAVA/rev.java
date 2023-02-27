import java.util.*;
public class rev{
    
    static void reverse(int x)
    {
        int rev = 0;
        while(x!=0)
        {
            int d = x%10;
            if(d==0)
            {
                continue;
            }
            rev = rev*10+d;
            x/=10;
        }
        System.out.println(rev);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("x = ");
        int x = sc.nextInt();
        reverse(x);
    }
}