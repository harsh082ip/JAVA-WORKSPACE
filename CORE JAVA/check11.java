import java.io.IOException;
public class check11 {
    public static void main(String[] args) {
        try{
            int a = 123/0;
        System.out.println(a);
        }
        catch(IOException e)
        {
            System.out.println("Exeption occured");
        }
    }
}
