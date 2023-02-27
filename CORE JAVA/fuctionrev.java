import java.util.Scanner;

public class fuctionrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = sum(a ,b);
        System.out.println(result);
        System.out.println(sum(a, b));
    }
    static int sum(int x, int y)
    {
        int z = x + y;
        return z;
    }
}
