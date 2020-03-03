package Prog.gl.exercices;

public class vendeur extends allEmploye {
	
	final private int base = 2000;
	private int commission ;
	
	public vendeur (int commission) {
		this.commission = commission;
	}

	
	public double salaire() {
		return base + commission ;
	}
	
	

}
