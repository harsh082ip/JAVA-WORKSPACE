import java.util.Scanner;

class BinaryTree{
  
  public BinaryTree() {
    
  }

  private static class Node {
    public Node left;
    public Node right;
    public int value;

    public Node(int value) {
      this.value = value;
    }
  }

  private Node root;
  
  // insert elements
  public void populate(Scanner scanner) {
    System.out.println("Enter the root node: ");
    int value = scanner.nextInt();
    root = new Node(value);
  }

  private void populate(Scannner scanner, Node node) {
    System.out.println("Do you wanto to enter left of " + node.value);
    boolean left = scanner.nextBoolean();
    if(left) {
      System.out.println("Enter the value of the left of " + node .value);
      int value = scanner.nextInt();
      node.left = new Node(value);
      populate(scanner, node.left);
    }

    System.out.println("Do you wanto to enter right of " + node.value);
    boolean right = scanner.nextBoolean();
    if(right) {
      System.out.println("Enter the value of the right of " + node.value);
      int value = scanner.nextInt();
      node.right = new Node(value);
      populate(scanner, node.right);
    }
  }

  public void display() {
    display(this.root, "");
  }

  private void display(Node node, String indent) {
    if(node == null) {
      return;
    }
    System.out.println(indent + node.value);
    display(node.left, indent + "\t");
    display(node.right, indent + "\t");
  }

  public void prettyDisplay() {
    prettyDisplay(root, 0);
  }

  private void preetyDislay(Node node, int level) {
    if(node == null) {
      return;
    }
    prettyDisplay(node.right, level + 1);
    if(level != 0) {
      for(int i = 0; i < level-1; i++) {
        System.out.print("|\t\t");
      }
      System.out.println("!------->" + node.value);
      
    } else {
      System.out.println(node.value);
    }
    preetyDislay(node.left, level + 1);
  }
}