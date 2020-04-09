package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("Is Lucas fat?");
		// 3.  Use an if statement to check if their answer is correct
		if (answer.equalsIgnoreCase("yes")) {
			score++;
		}
		// 4.  if the user's answer was correct, add one to their score 
		String answerTwo = JOptionPane.showInputDialog("Is Lucas poopy?");
		if (answerTwo.equalsIgnoreCase("yes")) {
			score++;
		}
		String answerThree = JOptionPane.showInputDialog("Is Lucas nasty games?");
		if (answerThree.equalsIgnoreCase("yes")) {
			score++;
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		System.out.println("Your score is "+score);
	}
}
