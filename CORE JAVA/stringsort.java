import java.util.*;
public class stringsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        String res = "";
        int l = s.length();
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
        System.out.println("Sorted String will be: "+ res);
    }
}
