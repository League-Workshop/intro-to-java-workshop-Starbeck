package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;



public class FourSquare {
	
	// 2. Create a new Robot (_/)
	Robot k1b0 = new Robot();
	void drawSquare() {
		//JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		// 3. Fill in the code to draw a square inside the method below. */
		k1b0.penDown();
		k1b0.move(100);
		
		
	}
	void go() {
		// 4. Make the robot move as fast as possible (_/)
k1b0.setSpeed(100);
		// 5. Set the pen width to 5 (_/)
k1b0.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times... (_/)
for(int i = 0; i<4; i++) {
			// 7. Set the pen color to random (_/)
	k1b0.setRandomPenColor();
			// 1. Call the drawSquare() method (_/)
	drawSquare();
			// 8. Turn the robot 90 degrees to the right (_/)
	k1b0.turn(90);
}
	}

	
	

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



