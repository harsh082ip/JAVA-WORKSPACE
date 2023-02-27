import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe {
  private static final int SIZE = 3;
  private JFrame frame;
  private JButton[][] buttons;
  private boolean xTurn;
  
  public TicTacToe() {
    frame = new JFrame("Tic Tac Toe");
    Container content = frame.getContentPane();
    content.setLayout(new GridLayout(SIZE, SIZE));
    buttons = new JButton[SIZE][SIZE];
    
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        buttons[i][j] = new JButton();
        content.add(buttons[i][j]);
        buttons[i][j].addActionListener(new ButtonListener());
      }
    }
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.setVisible(true);
    xTurn = true;
  }
  
  private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      JButton button = (JButton) e.getSource();
      String text = xTurn ? "X" : "O";
      button.setText(text);
      button.setEnabled(false);
      xTurn = !xTurn;
    }
  }
  
  public static void main(String[] args) {
    new TicTacToe();
  }
}

 // public static void main(String args[])
    // {

    //     String str = "HARSH VARDHAN SINGH";

 
    //     StringBuffer string = new StringBuffer(str);
    //     string.setCharAt(6, 'i');
    //     str = string.toString();
 
    //     // Print the modified string
    //     System.out.println(str);

    // }
