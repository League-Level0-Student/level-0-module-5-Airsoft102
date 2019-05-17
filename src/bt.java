import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class bt {
public static void main(String[] args) {
	String bob=JOptionPane.showInputDialog("what is 2+2");
	 if (bob.contentEquals("4")) {
		JOptionPane.showMessageDialog(null, "good job");
	}
	
}
}
