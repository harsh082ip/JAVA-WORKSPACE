import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class func_armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int x = sc.nextInt();
        System.out.println(is_armstrong(x));
    }
    static boolean is_armstrong(int x)
    {
        int y=x;
        int sum=0;
        while(x!=0)
        {
            int d=x%10;
            sum=sum+d*d*d;
            x/=10;
        }
        return sum==y;
        // if (sum==y)
        // {
        //     return true;
        // }
        // else{
        //     return false;
        // }
    }
}
