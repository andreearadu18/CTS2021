package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Test
	public void testCorectitudineConstructorCuParametru() {
		String nume = "Gigel";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testInitializareListaInConstructorCuParametru() {
		Student student = new Student("Gigel");
		//assertNotEquals(null, student.getNote()); //lista de note sa nu fie null - echivalent NotNull
		assertNotNull(student.getNote());
	}

	@Test
	public void testConstructorFaraParametri() {
		Student student = new Student();
		assertNotNull("lista nu a fost init",student.getNote());
		assertNotNull("numele nu a fost init", student.getNume());
	}
	
	@Test
	public void testAdaugaNota() {
		int nota = 10;
		Student student = new Student();
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
}
