import javax.swing.JOptionPane;

public class fun {
public static void main(String[] args) {
	
	String I= JOptionPane.showInputDialog("put in you price for this item");
	
	int g=Integer.parseInt(I);
		 int H=500;
	if (g<H) {
		JOptionPane.showMessageDialog(null, "Best Price!");
	H=g;
	}
	else {
		JOptionPane.showMessageDialog(null, "Better prices.");
	}

	String n=JOptionPane.showInputDialog("put in your price");
	
	int c=Integer.parseInt(n);

if (g<H) {
	JOptionPane.showMessageDialog(null, "Best Price!");
H=g;
}
else {
	JOptionPane.showMessageDialog(null, "Better prices.");
}
	
}	
}

//this is for home fun