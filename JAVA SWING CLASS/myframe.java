import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class myframe extends JFrame{
    myframe()
    {
        
        this.setTitle("This is my First JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(420, 420);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("E:\\photos\\photo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(123, 50, 250));
    }
    
}
