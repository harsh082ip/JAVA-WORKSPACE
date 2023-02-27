public class test22 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        // s = s.trim();
        test22 t1 = new test22();
        System.out.println(t1.isPalindrome(s));
    }
    public boolean isPalindrome(String s) {
        s = s.trim();
        int l =s.length();
        String r = "";
        s = s.toLowerCase();
        if(s == "")
            return true;
        for(int i =0; i<=l-1; i++)
        {
            char ch = s.charAt(i);
            for(char a = 'a'; a<='z'; a++)
            {
                if(ch == a)
                {
                    r = r + a;
                }
            }
        }
        int len = r.length();
        String rev = "";
        System.out.println(r);
        for(int j = len-1; j>=0; j--)
        {
            char c = r.charAt(j);
            rev = rev + c;
        }
        System.out.println(rev);
        if(rev.equals(r))
            return true;
        else
            return false;
        
    }
}
