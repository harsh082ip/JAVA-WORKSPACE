import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class SimpleWebBrowser extends JFrame {
  // The text field where the user enters a URL
  private JTextField addressBar;

  // The main panel where the web page is displayed
  private JEditorPane display;

  // Constructor
  public SimpleWebBrowser() {
    // Set the title and size of the frame
    setTitle("Simple Web Browser");
    setSize(640, 480);

    // Add the address bar and the display panel to the frame
    add(new JLabel("Address: "), BorderLayout.NORTH);
    addressBar = new JTextField();
    add(addressBar, BorderLayout.NORTH);
    display = new JEditorPane();
    display.setContentType("text/html");
    add(new JScrollPane(display), BorderLayout.CENTER);

    // Add an action listener to the address bar
    addressBar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        loadPage(e.getActionCommand());
      }
    });

    // Set the default close operation and make the frame visible
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  // Load a web page into the display panel
  private void loadPage(String url) {
    try {
      display.setPage(url);
      addressBar.setText(url);
    } catch (Exception e) {
      display.setText("Error: " + e);
    }
  }

  public static void main(String[] args) {
    new SimpleWebBrowser();
  }
}
