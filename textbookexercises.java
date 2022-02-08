//This is a simple program that rolls a die for you. Can probably make this more user friendly using the JOptionPane
public class MyClass {
    public static void main(String args[]) {
      int roll = (int)(Math.random()*6) + 1;

      System.out.println("Your die roll is " + roll);
    }
}

//Program that says hello with inserted name. Will need to test on own computer bc it's acting silly with online compiler.
import javax.swing.JOptionPane;
public class MyClass {
    public static void main(String args[]) {
      String intro = "What is your name?";
      String name = JOptionPane.showInputDialog(hello);
      name = name.toUpperCase();
      String hello = "Hello" + name + "It's nice to meet you.";
      JOptionPane.showMessageDialog(hello);
    }
}
