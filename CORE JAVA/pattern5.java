    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *

public class pattern5 {
    public static void main(String[] args) {
        int a = (9/2)+1;
        for(int i = 1; i<=9; i++)
        {
            if(i<=a){
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        else
        { 
            a--;
        for(int k = a; k>=1; k--)
        {
            System.out.print("*");
        }
        System.out.println();
        }
    }
    }
    
}
