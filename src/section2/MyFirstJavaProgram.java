package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot guy = new Robot();
		guy.setSpeed(25);
        guy.penDown();
        guy.hide();
        guy.setPenWidth(100);
        guy.setRandomPenColor();
		guy.move(100);
		guy.turn(-90);
		guy.setRandomPenColor();
		guy.move(100);
		guy.turn(-90);
		guy.setRandomPenColor();
		guy.move(100);
		guy.turn(-90);
		guy.setRandomPenColor();
		guy.move(100);
		for(int i = 0; i < 4; i++) {
			//color
			guy.setRandomPenColor();
			//move
			guy.move(100);
			//turn
			guy.turn(-90);
			
		}
	}
}
