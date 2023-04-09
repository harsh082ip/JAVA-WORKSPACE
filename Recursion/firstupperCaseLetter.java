// https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
public class firstupperCaseLetter {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char word = firstUpperCase(s, 0, s.charAt(0));
        System.out.println(word);
    }
    static char firstUpperCase(String s, int i, char c)
    {
        int l = s.length();
        if(i == l)
        {
            return c;
        }
        int word = s.charAt(i);
        if(word >= 65 && word <= 90)
        {
            return s.charAt(i);
        }
        i++;
        return firstUpperCase(s, i, c);
    }
}
