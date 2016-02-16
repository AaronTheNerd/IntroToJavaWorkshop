package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Aaron = new Robot ("batman");
Aaron.setPenWidth(10);
Aaron.setRandomPenColor();
Aaron.penDown();
for (int i = 0; i < 5; i++) {
	Aaron.move(50);
	Aaron.turn(90);
	Aaron.setAngle(100);
	Aaron.move(-50);
	Aaron.turn(-90);
}
Aaron.move(-300);
	}
}
