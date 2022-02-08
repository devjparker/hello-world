//First assignment where we use JOptionPane to have user input.
import javax.swing.JOptionPane;

public class SuperPower {
	public static void main(String[] args)
	{
		String power = JOptionPane.showInputDialog("What is your super power?");
		power = power.toUpperCase();
		JOptionPane.showMessageDialog(null,power+" TO THE RESCUE!");
	}
}

//For, while, and do-while difference assignment. My first group of 3 was a countdown.
public class PlayAround {

    public static void main(String[] args) {

        int i = 10;
        System.out.println("Counting down from " + i);
        while (i > 0) {
            System.out.println(i);
            i--;
            if (i == 0) {
                System.out.println("Blastoff!");
            }
        }
    }
}
public class PlayAround {

    public static void main(String[] args) {

        boolean flag = true;
        int i = 10;
        System.out.println("Counting down from " + i);
        do {
            System.out.println(i);
            i--;
            if (i == 0) {
                System.out.println("Blastoff!");
                flag = false;
            }
        } while(flag == true);
    }
}
public class PlayAround {

    public static void main(String[] args) {


        for (int i = 10; i > 0; i--) {
            if (i == 10) {
                System.out.println("Counting down from " + i);
            }
            System.out.println(i);
            if (i == 1) {
                System.out.println("Blastoff!");
            }
        }
    }
}

//These 3 took a target of 400 and did a random number finder.
public class PlayAround {

    public static void main(String[] args) {

        boolean flag = false;
        int target = 400;
        do {
            int random = (int)(Math.random()*1000);
            if (random == target) {
                flag = true;
            }
            System.out.println("Random number is " + random);
        } while (flag == false);
    }
}
public class PlayAround {

    public static void main(String[] args) {

        int random = 0;
        int target = 400;
        while (random != target) {
            System.out.println("Random number is " + random);
            random = (int)(Math.random()*1000);
        }
        System.out.println("Final random number is " + random);
    }
}
public class PlayAround {

public static void main(String[] args) {

int random = (int)(Math.random()*1000);
for (int i = 0; i != 400; i = random) {
System.out.println("Random number is " + random);
random = (int)(Math.random()*1000);
    }
        System.out.println("Final random number is " + random);
    }
}

//This set of 3 was me playing with arrays as well as looking at the difference between for, do-while, and whiles. I took an average score. 
public class PlayAround {

    public static void main(String[] args) {

        double[] scores = {
            90, 85, 98, 99
        };
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double average = sum/scores.length;
        System.out.println("Your average quiz score is " + average);
    }
}
public class PlayAround {

    public static void main(String[] args) {

        double[] scores = {
            90, 85, 98, 99
        };
        double sum = 0;
        int i = 0;
        while (i < scores.length) {
            sum += scores[i];
            i++;
        }
        double average = sum/scores.length;
        System.out.println("Your average quiz score is " + average);
    }
}
public class PlayAround {

    public static void main(String[] args) {

        double[] scores = {
            90, 85, 98, 99
        };
        double sum = 0;
        int i = 0;
        do {
            sum += scores[i];
            i++;
        }while (i < scores.length);

        double average = sum/scores.length;
        System.out.println("Your average quiz score is " + average);
    }
}

//Miniature quiz assignment. I wanted to do this with a for loop, but the assignment required a while loop.
import javax.swing.JOptionPane;

public class Quiz {
	public static void main(String[] args) {
		String question = "Two towers stand fair, one of black, one of white. One of the land, one of the sea. What are we?\n";
		question += "A. Chess pieces. \nB. Ivory and granite buildings. \nC. Salt and Pepper shakers. \nD. Newspaper stands. \nE. None of these are correct.";
		String answer;
		int i = 0;
		while(i <= 0) {
			answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			if (answer.equals("C")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			break;
			}
			else if (answer.equals("A")) {
				JOptionPane.showMessageDialog(null, "Incorrect, please try again!");
			}
			else if (answer.equals("B")) {
				JOptionPane.showMessageDialog(null, "Incorrect, please try again!");
			}
			else if (answer.equals("D")) {
				JOptionPane.showMessageDialog(null, "Incorrect, please try again!");
			}
			else if (answer.equals("E")) {
				JOptionPane.showMessageDialog(null, "Incorrect, please try again!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Invalid answer, select from A-E");
			}
		}
	}
}
