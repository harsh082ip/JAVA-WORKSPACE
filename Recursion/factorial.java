public class factorial {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(fact(number, 0, 1));
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
}
