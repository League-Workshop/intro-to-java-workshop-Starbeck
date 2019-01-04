package section3;
//Project: C.A.S
import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		String oof;
		// 1. Ask the user if they know how to write code.
oof = JOptionPane.showInputDialog(null, "Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
if(oof == "yes"){
	JOptionPane.showMessageDialog(null, "You will rule the world.");
}
else {
	JOptionPane.showMessageDialog(null, "Good luck washing dishes.");
}
}
}
		// 3. Otherwise, wish them good luck washing dishes.
