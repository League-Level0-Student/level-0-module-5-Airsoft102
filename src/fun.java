import javax.swing.JOptionPane;

public class fun {
public static void main(String[] args) {
	
	String I= JOptionPane.showInputDialog("put in you price for this item");
	
	int g=Integer.parseInt(I);
		
	if (g<500) {
		JOptionPane.showMessageDialog(null, "Best Price!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Better prices.");
	}

}
	
	
	
}

//this is for home fun