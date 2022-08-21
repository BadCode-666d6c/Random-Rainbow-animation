package core;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Label extends JLabel{

	private static final long serialVersionUID = 1L;

	long i=System.currentTimeMillis();
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); 
		Graphics2D graphics2D = (Graphics2D) g;
		graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		Var.lb.setBounds(0, 0, Var.jfr.getWidth(), Var.jfr.getHeight());
		g.setColor(Color.black);
		g.fillRect(0, 0, Var.jfr.getWidth(), Var.jfr.getHeight());

		
		for(Points p : Var.points)
			p.drawPoint(g);
		

		long t=System.currentTimeMillis();
		
		for(Points p : Var.points)
			p.update(t-i);
		
		
		i=t;
		repaint();
	}
	
}
