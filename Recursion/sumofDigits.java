public class sumofDigits {
    public static void main(String[] args) {
        System.out.println(sumofdidgits(12345));
    }
    static int sumofdidgits(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        return  n%10 + sumofdidgits(n/10) ;
    }
}
