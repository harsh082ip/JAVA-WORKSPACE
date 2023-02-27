import java.util.*;
public class percentageOfUpperandLower {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        int l = s.length();
        int upper = 0;
        int lower = 0;
        int len = l;
        int special = 0;
        for(int i = 0; i<=l-1; i++)
        {
            char ch = s.charAt(i);
            int c = (int)ch;
            if(c>=97 && c<=122)
                lower++;
            else if(c>=65 && c<=90)
                 upper++;
            else
                special++;
        }
        // int spec = len-(upper + lower);
        // System.out.println(spec);
        System.out.println(lower);
        System.out.println(upper);
        System.out.println(len);
        double per = (double)(upper*100)/len;
        double per1 = (double)(lower*100)/len;
        double spec = (double)(special*100)/len;
        System.out.println("UpperCase: " + per + "%");
        System.out.println("LowerCase: " + per1 + "%");
        System.out.println("LowerCase: " + spec + "%");
    }
}
