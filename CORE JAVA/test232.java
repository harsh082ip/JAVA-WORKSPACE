class test232
{
    public static void main(String[] args) {
        funrev(5);
    }
    static void funrev(int n)
    {
        if(n == 0)
        {
            return;
        }
        funrev(n-1);
        System.out.println(n-1);
    }
}