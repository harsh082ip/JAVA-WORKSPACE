package FileHandling;
import java.io.File;
import java.io.IOException;
public class createafile {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\HARSH\\Desktop\\Java WorkSpace\\FilesCreatedJava\\Hello World.txt");
        try{
        if(f1.createNewFile())
        {
            System.out.println("File Created");
        }
    }
    catch(IOException e)
    {
        System.out.println("An Error Occured! :/");
    }

    }
}
