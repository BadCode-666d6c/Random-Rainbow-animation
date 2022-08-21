package core;

import java.awt.Color;
import java.awt.Graphics;

public class Points {

	public double x,y,mx,my;
	
	public Points(double x,double y, double mx, double my) {
	
		this.x=x;
		this.y=y;
		this.mx=mx;
		this.my=my;
		
		
	}
	public void drawPoint(Graphics g){
		
		Color c = Utils.getRainbowColor((int) (x+y+Var.t));
		
		g.setColor(c);
		g.fillOval((int) (x-Var.size/2),(int) (y-Var.size/2), Var.size, Var.size);;
	
		
		for(Points p : Var.points) {
			if(p.equals(this))
				continue;
			
			double dist = Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
			
			if(dist<Var.maxdis) {
				g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),(int)(255*(1-(dist/(Var.maxdis)))*0.8)));
				g.drawLine((int)x, (int)y, (int)p.x, (int)p.y);
			}
		}
	}
	void update(double t) {
		
		x+=mx*(t/1000.0);
		y+=my*(t/1000.0);
		if(x-Var.size-Var.maxdis>Var.jfr.getWidth()||y-Var.size-Var.maxdis>Var.jfr.getHeight())
			 Point();
		if(x+Var.size+Var.maxdis<0||y+Var.size+Var.maxdis<0)
			 Point();
	}
	public void Point() {
		int r = (int)(Math.random()*4);

		if(r==0) {
			x=-Var.size-Var.maxdis;
			y=Math.random()*(Var.jfr.getHeight()+Var.maxdis*2)-Var.maxdis;
			
			mx=Math.random()*Var.v+Var.vm;
			my=Math.random()*Var.v*2-Var.v;
		}
		if(r==1) {
			x=Math.random()*(Var.jfr.getWidth()+Var.maxdis*2)-Var.maxdis;
			y=-Var.size-Var.maxdis;
			
			mx=Math.random()*Var.v*2-Var.v;
			my=Math.random()*Var.v+Var.vm;
		}
		if(r==2) {
			x=Math.random()*(Var.jfr.getWidth()+Var.maxdis+Var.size);
			y=Var.jfr.getHeight()+Var.maxdis+Var.size;
			
			mx=Math.random()*Var.v*2-Var.v;
			my=-Math.random()*Var.v-Var.vm;
		}
		if(r==3) {
			x=Var.jfr.getWidth()+Var.maxdis+Var.size;
			y=Math.random()*(Var.jfr.getHeight()+Var.maxdis+Var.size);
			
			my=Math.random()*Var.v*2-Var.v;
			mx=-Math.random()*Var.v-Var.vm;
		}

		
	}
}
