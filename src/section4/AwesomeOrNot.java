package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		Random rand = new Random();
		int bob = rand.nextInt(4);
	// 3. Print out this variable
		System.out.println(bob);
	// 4. Get the user to enter something that they think is awesome
		String awesome = JOptionPane.showInputDialog("What is something that you think is awesome?");
	// 5. If the random number is 0
		if (bob==0) {
			JOptionPane.showMessageDialog(null, awesome+ " is awesome");
		}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
		else if (bob==1) {
			JOptionPane.showMessageDialog(null, awesome+" is ok i guess");
		}

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
		else if (bob==2) {
			JOptionPane.showMessageDialog(null, awesome+" is boring");
		}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
		else if (bob==3) {
			JOptionPane.showMessageDialog(null, awesome+" is way better than poopoo lulu");
		}
	// -- write your own answer
	}

}


