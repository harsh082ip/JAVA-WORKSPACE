import java.util.*;
public class frequencyofduplicatechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        String res = "";
        int l = s.length();

        //for sorting
        for(char a = 'a'; a<='z'; a++)
        {
            for(int i = 0; i<=l-1; i++)
            {
                char ch = s.charAt(i);
                if(a==ch)
                {
                    res = res + ch;
                }
            }
        }

        //for frequency
        for(char b = 'a'; b<='z'; b++)
        {
            int count = 0;
            for (int j=0; j<res.length(); j++)
            {
                if (b == res.charAt(j))
                {
                    count++;

                }
            }
            if(count==0)
            {
                continue;
            }
            else{
                System.out.println(b+"-->"+count);
            }

        }
    }
}
