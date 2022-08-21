package core;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Key implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode()==KeyEvent.VK_ESCAPE)
			System.exit(0);
			
		if(e.getKeyCode()==KeyEvent.VK_F11) {
			
			if(Var.Full) {
				Var.jfr.dispose();
				Var.jfr.setUndecorated(false);
				Var.jfr.setVisible(true);
				Var.jfr.setSize(800, 800);
				Var.jfr.setLocationRelativeTo(null);
				Var.Full=false;
			}else {
				Var.jfr.dispose();
				Var.jfr.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				Var.jfr.setUndecorated(true);
				Var.jfr.setVisible(true);
				Var.Full=true;
				
			}
			
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
