package Prog.gl.exercices;

public class Manager extends allEmploye {
	private final int base = 1500 ;
	private int Nb_Employe ;
	
	public Manager(int Nb_Employe) {
		this.Nb_Employe = Nb_Employe;
	}


	public double salaire() {
		
		return base + Nb_Employe * 100;
	}
	
	
}
