package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;
import dubluriTeste.StudentDummy;

public class TesteGetPromovabilitateGrupa {
	

	@Test
	public void testRight() {
		Grupa grupa = new Grupa(1085);
		for(int i = 0; i < 3; i++) {
			Student stud = new Student();
			stud.adaugaNota(4);
			stud.adaugaNota(3);
			grupa.adaugaStudent(stud);
		}
		for(int i = 0; i < 7; i++) {
			Student stud = new Student();
			stud.adaugaNota(10);
			stud.adaugaNota(9);
			grupa.adaugaStudent(stud);
		}
		assertEquals(0.7, grupa.getPromovabilitate(), 0.01);
	}
	@Test
	public void testLowerBound() {
		Grupa grupa = new Grupa(1085);
		for(int i = 0; i < 6; i++) {
			Student stud = new Student("Gigel");
			stud.adaugaNota(10);
			stud.adaugaNota(3);
			grupa.adaugaStudent(stud);
		}
		assertEquals(0, grupa.getPromovabilitate(),0.01);
	}
	
	@Test
	public void testUpperBound() {
		Grupa grupa = new Grupa(1085);
		for(int i = 0; i < 6; i++) {
			Student stud = new Student("Gigel");
			stud.adaugaNota(7);
			stud.adaugaNota(9);
			grupa.adaugaStudent(stud);
		}
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testError() {
		Grupa grupa = new Grupa(1085);
		grupa.getPromovabilitate();
	}
	

}
