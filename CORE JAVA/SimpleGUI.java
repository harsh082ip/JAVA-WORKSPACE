import javax.swing.*;
import java.awt.*;

public class SimpleGUI {
  public static void main(String[] args) {
    // Create a new JFrame container
    JFrame frame = new JFrame("Simple GUI");

    // Give the frame an initial size
    frame.setSize(300, 300);

    // Terminate the program when the user closes the application
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create a JLabel
    JLabel label = new JLabel("This is a label");

    // Add the label to the content pane
    frame.add(label);

    // Display the frame
    frame.setVisible(true);
  }
}
