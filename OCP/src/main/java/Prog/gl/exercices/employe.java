package Prog.gl.exercices;

public class employe extends allEmploye {
	
	private final int salaire = 1500 ;
	private int startYear;
	
	public employe(int startYear) {
		this.startYear = startYear ;
	}
	
	public double salaire() {
		
		return salaire + (2020-this.startYear)*20 ;
	}
	

}
