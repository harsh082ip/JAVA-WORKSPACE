package FileHandling;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
public class FileWrite {
    public static void main(String[] args) {
        try{
            FileWriter f1 = new FileWriter("C:\\Users\\HARSH\\Desktop\\Java WorkSpace\\FilesCreatedJava\\Hello World.txt");
            f1.write("Hello, My Name is Harsh. I'm 18 years Old");
            System.out.println("File Write Sucessfull");
            f1.close();
        }
        catch(IOException e){
                System.out.println("An Unknown Error Occured :/");
        }

    }
}
