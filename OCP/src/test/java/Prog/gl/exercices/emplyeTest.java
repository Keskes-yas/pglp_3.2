
package Prog.gl.exercices;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class emplyeTest {
	
	
	@Test
	public void allTest() {
		vendeur v = new vendeur(10);
		vendeur v1 = new vendeur(20);
		employe e = new employe(2015);
		employe e1 = new employe(2012);
		Manager m = new Manager(5);
		
		ArrayList<allEmploye> A = new ArrayList<allEmploye>() ;
		A.add(e1);
		A.add(e);
		A.add(v1);
		A.add(v);
		A.add(m);
		
		double salaireTotal = 0 ;
		for (int i = 0 ; i < A.size() ; i++) {
			salaireTotal += A.get(i).salaire(); 
		}
		System.out.println("salaire total :"+ salaireTotal);
		
		assertTrue(9290 == salaireTotal);
	}
}
