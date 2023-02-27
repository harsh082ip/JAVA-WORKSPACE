import java.util.*;
public class func_prime {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int x = sc.nextInt();
        System.out.println(is_prime(x));
    }
    static boolean is_prime(int n)
    {
        int count=0;
        for(int i=2; i<n; i++)
        {
            if(n%i==0)
            {
                count=1;
                break;
            }
        }
        if(count==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
}

