package section2;

import org.jointheleague.graphical.robot.Robot;

public class DrawSquare {
	public static void main(String[] args) {
		Robot k1b0 = new Robot();
		k1b0.setSpeed(100);
		k1b0.move(50);
		k1b0.penDown();
		k1b0.turn(90);
		k1b0.move(50);
		k1b0.turn(90);
		k1b0.move(100);
		k1b0.turn(90);
		k1b0.move(100);
		k1b0.turn(90);
		k1b0.move(100);
		k1b0.turn(90);
		k1b0.move(50);
		k1b0.turn(90);
		k1b0.penUp();
		k1b0.move(50);
		k1b0.turn(180);
	}

}
