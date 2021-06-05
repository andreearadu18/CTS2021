package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Grupa;
import clase.Student;
import suite.categorii.ITestePromovabilitateCategorii;

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
	@Category(ITestePromovabilitateCategorii.class)
	public void testPerformance() {
		grupa.getPromovabilitate();
	}

}
