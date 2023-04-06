public class pallindrome {
    public static void main(String[] args) {
        int number = 1122211;
        ispallindrome(number, number, 0);
    }
    static void ispallindrome(int number, int copy, int rev)
    {
        // if(number < 0)
        if(number <= 0)
        {
            if(copy == rev)
            {
                System.out.println("Pallindrome");
                return;
            }
            else
            {
                System.out.println("Not Pallindrome");
                return;
            }
        }
        int d = number % 10;
        rev = rev * 10 + d;
        number = number / 10;
        ispallindrome(number, copy, rev);
    }
}
