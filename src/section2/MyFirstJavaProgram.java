package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot smarty = new Robot();
		smarty.penDown();
		smarty.setSpeed(100);
		for (int i = 0; i < 4; i++) {
			smarty.move(200);
			smarty.turn(90);

		}
	}
}
