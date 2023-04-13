public class factorial {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(fact(number, 0, 1));
        System.out.println(fact2(number));
    }
    static int fact(int number, int i, int factorial)
    {
        if(i >= number)
        {
            return factorial;
        }
        i++;
        factorial = factorial * i;
        return fact(number, i, factorial);
    }
    static int fact2(int n)
    {
        if(n <= 1)
        {
            return 1;
        }
        return n * fact2(n-1);
    }
}
