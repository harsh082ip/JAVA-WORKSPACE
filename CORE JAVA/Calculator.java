import java.util.*;
public class Calculator {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press + for Addition");
            System.out.println("Press - for Subtraction");
            System.out.println("Press * for multiplication");
            System.out.println("Press / for Division");
            String ch=sc.nextLine();
            switch(ch)
            {
                case "+":
                System.out.println("How may Numbers You want to add?");
                int a=sc.nextInt();
                System.out.println("Enter Numbers:");
                int add=0;
                for(int i=1; i<=a; i++)
                {
                    int q=sc.nextInt();
                    add+=q;
                }
                System.out.println("Addition is "+add);
                break;
                case "-":
                System.out.println("Enter 1st No. :");
                int sub1=sc.nextInt();
                System.out.println("Enter 2nd No. :");
                int sub2=sc.nextInt();
                System.out.println("Subtraction is: "+(sub1-sub2));
                break;
                case "*":
                System.out.println("How many Numbers you want to Multiply?");
                int m=sc.nextInt();
                System.out.println("Enter Numbers: ");
                int mul=1;
                for(int i=1; i<=m; i++)
                {
                    mul*=sc.nextInt();
                }
                System.out.println("Multiplication is: "+mul);
                break;
                case "/":
                System.out.println("Enter 1st No. :");
                double num1=sc.nextDouble();
                System.out.println("Enter 2nd No. :");
                double num2=sc.nextDouble();
                System.out.println("Division of Numbers is: "+(num1/num2));
                default:
                System.out.println("Please Enter a valid Input :/");
                break;
            }
    }
}
