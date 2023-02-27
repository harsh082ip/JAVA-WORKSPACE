import java.util.*;
public class revastring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        int l = s.length();
        String rev = "";
        for(int i = l-1; i>=0; i--)
        {
            char c = s.charAt(i);
            rev = (String)rev+c;
        }
        System.out.println("Final Reversed String: "+ rev);
    }
}
