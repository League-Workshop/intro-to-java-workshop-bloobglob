package section2;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	//set sides
	static int sides = 10;
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
Robot robot = new Robot();
robot.hide();

        // 3. Put the robot's pen down
robot.penDown();

        // 6. Make the robot move as fast as possible
robot.setSpeed(100);

        // 5. Use a for loop to repeat everything below 4 times. 
for(int i = 0; i < sides; i++) {

        //         2. Move your robot 200 pixels
robot.move(100);

        //         4. Turn the robot 90 degrees to the right
robot.turn(360/sides);
    	
    		// 7. Change steps 4 and 5 to draw a different shape (e.g. triangle (3-sides), pentagon (5-sides), decagon (10-sides)).
   
    }
}}
