import java.util.*;
public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        s = s.trim();
        s = " " + s;
        int valofi = 0;
        String res = "";
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == ' ')
            {
                valofi = i;
                for(int j = i+1; j<s.length(); j++)
                {
                    char c = s.charAt(j);
                    if(c == ' ')
                    {
                        char p = s.charAt(i+1);
                        res = (String)res+p+'.';
                        break;
                    }
                }
            }
        }
        for(int k = valofi+1; k<s.length(); k++)
        {
            res = res+s.charAt(k);
        }
        System.out.println(res);
    }
}
