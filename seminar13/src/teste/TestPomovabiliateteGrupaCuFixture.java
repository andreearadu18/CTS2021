package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

public class TestPomovabiliateteGrupaCuFixture {
	
private Grupa grupa;
	
	@Before
	public void setUp() {
	grupa = new Grupa(1085);
		for(int i = 0; i < 35; i++) {
			Student stud = new Student("Gigel");
			stud.adaugaNota(7);
			stud.adaugaNota(9);
			grupa.adaugaStudent(stud);
		}
	}

	@Test(timeout = 500)
	public void testPerformance() {
		grupa.getPromovabilitate();
	}

}
