import java.util.*;
class test2 {
    public int lengthOfLastWord(String s) {
        int l = s.length();
        int count = 0;
        // s = s.trim();
        String ss = "";
        int string_length = 0;
        for(int i = 0; i <= l-1; i++)
        {
            char ch = s.charAt(i);
            // String ch1 = ch.toString();
            char c=' ';
            if(ch==c)
            {
                count=i;
            }
        }
        if(count > 0)
        {
            for(int j = count+1; j <= l-1; j++)
            {
                ss = ss + s.charAt(j);
            }
             string_length = ss.length();
        }
        else {
            for(int k = 0; k <= l-1; k++)
            {
                ss = ss + s.charAt(k);
            }
             string_length = ss.length();
        }
        return string_length;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("s = ");
        String s = sc.nextLine();
        test2 s1 = new test2();
        System.out.println(s1.lengthOfLastWord(s.strip()));
    }
}                                  