import java.math.*;
import java.util.*;
public class test {
    public int maxRepeating(String sequence, String word) {
        int l = sequence.length();
        int count = 0;
        String s = "";
        for(int i = 0; i<l; i++)
        {
            char ch = sequence.charAt(i);
            if(ch == word.charAt(0))
            {
                for(int j = i; i<l; i++)
                {
                    char c = sequence.charAt(j);
                    s = s+c;
                    System.out.println(s);
                    if(s.equals(word))
                    {
                        count++;
                        s = "";
                    }
                }
            }
            break;
        }
        return count;
    }
    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.maxRepeating("ababc", "ab"));
    }
}

