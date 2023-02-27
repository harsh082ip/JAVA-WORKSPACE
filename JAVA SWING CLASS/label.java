import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class label {
    public static void main(String[] args) {

        JLabel label = new JLabel();
        label.setText("Bhai Padh le?");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(125,20,250));
        

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);

    }
}
