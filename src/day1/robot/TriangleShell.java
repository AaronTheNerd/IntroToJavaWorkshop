package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
Robot deadpool=new Robot("batman");
	
	void go() {
		 // 3. delete this line (used only for testing)
deadpool.penDown();
		// 6. Make the robot go as fast as possible
deadpool.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to 50
int variable = 50;
		// 7. Do the following (up to step 10) 60 times
for (int i = 0; i < 60; i++) {
	// 9. Change the color of the pen to a random color
	deadpool.setRandomPenColor();
				// 8. Increase the length of the side by 10 pixels
		variable += 10;
				// 5. call your drawTriangle() method using your length variable
		drawTriangle(variable);
				// 10. Turn the tortoise 6 degrees to the right
		deadpool.turn(6);
}
			
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
for (int i = 0; i < 4; i++) {
	deadpool.move(100);
	deadpool.turn(45);
}		
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
