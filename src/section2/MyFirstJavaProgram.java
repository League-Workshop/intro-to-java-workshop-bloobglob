package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		Robot mom = new Robot();
		mom.setX(500);
		mom.setX(500);
		mom.penDown();
		mom.hide();
		mom.setSpeed(100);
		for (int i = 0; i < 3; i++) {
			mom.move(30);
			mom.turn(90);
			mom.setRandomPenColor();
		}
		mom.move(30);
		mom.setRandomPenColor();
		for (int i = 0; i < 3; i++) {
			mom.move(30);
			mom.turn(90);
			mom.setRandomPenColor();
		}
	}
}
