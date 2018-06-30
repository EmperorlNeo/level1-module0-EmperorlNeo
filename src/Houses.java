import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot x = new Robot();
	static int house = 0;

	public static void main(String[] args) {
		Robot.setWindowColor(Color.BLACK);
		x.moveTo(40, 520);
		x.setSpeed(100000);
		x.penDown();

		house("large", null);
		house("small", null);
		house("medium", null);
		house("large", null);
		house("small", null);
		house("medium", null);
	}

	public static void house(String height, String color) {

		if (height == "large") {
			house = 100;
			drawFlatRoof();

		}
		else if (height == "medium") {
			house = 75;
			drawFlatRoof();
			drawPointyRoof();
		}
		else if (height == "small") {
			house = 50;
			drawFlatRoof();
			drawPointyRoof();
		}

				
	}

	public static void drawPointyRoof() {
		x.setRandomPenColor();
		x.move(house);
		x.turn(45);
		x.move(15);
		x.turn(90);
		x.move(15);
		x.turn(45);
		x.move(house);
		x.turn(-90);
		x.setPenColor(Color.GREEN);
		x.move(30);
		x.turn(-90);
	}

	public static void drawFlatRoof() {
		x.setRandomPenColor();
		x.move(house);
		x.turn(90);
		x.move(30);
		x.turn(90);
		x.move(house);
		x.turn(-90);
		x.setPenColor(Color.GREEN);
		x.move(30);
		x.turn(-90);
	}
}
// small= 50
// medium= 75
// large= 100
// Huge= 125