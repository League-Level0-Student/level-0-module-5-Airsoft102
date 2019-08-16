import org.jointheleague.graphical.robot.Robot;

public class fun2 {
public static void main(String[] args) {
	
	Robot rob=new Robot();
	rob.setSpeed(10000);
	
	rob.penDown();
	rob.setRandomPenColor();
	for (int i = 0; i < 4; i++) {
		rob.move(300);
	rob.turn(90);
	}
	rob.penUp();
	rob.setRandomPenColor();
	rob.turn(-90);
rob.move(300);
rob.turn(90);
rob.penDown();
for (int i = 0; i < 4; i++) {
	rob.move(300);
rob.turn(90);
}
rob.penUp();
rob.setRandomPenColor();
rob.move(-300);
rob.penDown();
for (int i = 0; i < 4; i++) {
	rob.move(300);
rob.turn(90);
}
rob.setRandomPenColor();
rob.penUp();
rob.turn(90);
rob.move(300);
rob.turn(-90);
rob.penDown();
for (int i = 0; i < 4; i++) {
	rob.move(300);
rob.turn(90);
}
rob.penUp();
rob.move(175);
rob.turn(90);
rob.move(150);
rob.penDown();
for (int p = 0; p < 362; p++) {
	rob.move(1);
rob.turn(1);
}
rob.penUp();
rob.turn(-90);
rob.move(310);
rob.turn(-90);
rob.move(10);
rob.turn(90);
rob.penDown();
for (int p = 0; p < 365; p++) {
	rob.move(1);
rob.turn(1);
}
}
}
