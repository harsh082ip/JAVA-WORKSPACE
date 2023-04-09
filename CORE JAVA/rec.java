public class rec {
    public static void main(String[] args) {
        pr(1);
    }
    static void pr(int i)
    {
        if(i>5)
        {
            return;
        }
        System.out.println(i);
        i++;
        pr(i);
    }
}
