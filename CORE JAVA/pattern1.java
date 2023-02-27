// * * * * *
//   * * * *
//     * * *
//       * *
//         *
public class pattern1 {
    public static void main(String[] args) {
        int h = 5;
        for(int i = 1; i<=5; i++)
        {
            for(int j = 1; j<i; j++)
            {
                System.out.print(" ");
            }
            for(int k =1; k<=h; k++)
            {
                System.out.print("*");

            }
            System.out.println();
            h--;
        } 
    }
}
