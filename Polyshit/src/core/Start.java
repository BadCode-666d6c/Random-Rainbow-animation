package core;

public class Start {

	public static void main(String[] args) {
		
		new Gui();
		
		for(int i=0;i<800;i++)
		Var.points.add(new Points(
				Math.random()*(Var.jfr.getWidth()+Var.maxdis*2)-Var.maxdis,
				Math.random()*(Var.jfr.getHeight()+Var.maxdis*2)-Var.maxdis,
				Math.random()*Var.v*2-Var.v,
				Math.random()*Var.v*2-Var.v));
		
	}

}
