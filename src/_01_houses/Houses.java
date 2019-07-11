package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
public static void main(String[] args) {
	Robot a = new Robot(0,500);  
	a.setSpeed(1000000000);
	a.penDown();
	
	
	
	a.move(100);
	a.turn(90);
	a.move(50);
	a.turn(90);
	a.move(100);
	a.turn(-90);
	a.move(25);
	a.hide();
	}
	}

