import java.util.*;
public class howareyou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        s = s.trim();
        s = s + " ";
        int l = s.length();
        String res = "";
        for(int i = 0; i<l; i++)
        {
            int count = 0;
            char ch = s.charAt(i);
            if(ch == ' ')
            {
                for(int j = i-1; j>=0; j--)
                {
                    char c = s.charAt(j);
                    if(c == ' ')
                    {
                        break;
                    }
                    else
                    {
                        count++;
                        res = res + c;
                    }
                }
                if(count!=0){
                    res = res + " ";
                }
            }
        }
        System.out.println(res);
    }
}
