package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot k1b0 = new Robot();
		// 5. Set your robot's pen down 
		//k1b0.penDown();
		// 3. Set the robot to go at max speed (100)
		k1b0.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for(int l = 0; l<75; l++) {
			k1b0.penDown();
			// 7. Change the pen color to random
		k1b0.setRandomPenColor();
			// 6. Move the robot 5 times the loop counter (5*i)
		k1b0.move(5*l);
		for(int i = 0; i<5; i++) {
			// 2. Turn the robot 360/7 degrees to the right
		k1b0.turn(360/7);
			// 8. Set the pen width to i
			k1b0.setPenWidth(i);
		}
		for(int i = 0; i>0; i--)
		{
			k1b0.penDown();
		}
		}
		}
			
	}
