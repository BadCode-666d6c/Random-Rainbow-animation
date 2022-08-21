package core;

import javax.swing.JFrame;

public class Gui {

	public Gui() {

		Var.jfr.setTitle("Polyshit");
		Var.jfr.setDefaultCloseOperation(3);
		Var.jfr.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		Var.jfr.setUndecorated(true);
		Var.jfr.setVisible(true);
		Var.jfr.setLocationRelativeTo(null);
		Var.jfr.add(Var.lb);
		Var.jfr.addKeyListener(new Key());
		
	}
}
