//This is a simple program that rolls a die for you. Can probably make this more user friendly using the JOptionPane
public class MyClass {
    public static void main(String args[]) {
      int roll = (int)(Math.random()*6) + 1;

      System.out.println("Your die roll is " + roll);
    }
}
