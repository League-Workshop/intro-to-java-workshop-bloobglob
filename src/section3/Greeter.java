package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
	String poop = JOptionPane.showInputDialog("What's your name?");
	JOptionPane.showMessageDialog(null, "Hi "+poop);
	}
}
