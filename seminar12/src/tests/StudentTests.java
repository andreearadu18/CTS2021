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
	
	@Test
	public void testDimensiuneLista() {
		Student student = new Student();
		student.adaugaNota(10);
		student.adaugaNota(8);
		assertEquals(2, student.getNote().size());
	}
	
	@Test 
	public void testCalculeazaMedie() {
		Student student = new Student();
		student.adaugaNota(10);
		student.adaugaNota(9);
		assertEquals(9.5f, student.calculeazaMedie(),0.01); //0.1 (delta) marja de err
	}
	
	@Test
	public void testStudentCuRestanta() {
		Student student = new Student();
		student.adaugaNota(4);
		//assertEquals(true, student.areRestante()); 
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testStudentFaraRestanta() {
		Student student = new Student();
		student.adaugaNota(5);
		//assertEquals(false, student.areRestante());
		assertFalse(student.areRestante());
	}
	
	
	@Test
	public void testGetNotaIndexInvald() {   //specific JUnit 3
		Student student = new Student();
		student.adaugaNota(10);
		//1 - se exe
		try {
			//2 - se incearca exe
			student.getNota(-1);
			//3 - nu se ajunge
			fail("Nu trebuia sa ajunga aici. Mtd nu arunca exceptie");
		}catch(IndexOutOfBoundsException exception){
			//4 - se exe
			
		}catch(Exception exception) {
			//5 - nu se ajunge
			fail("Nu trebuia sa ajunga aici. Tipul exceptie aruncate nu este corect");
		}
		//6 - se exe
	}
	
	@Test(expected = IndexOutOfBoundsException.class) // verifica daca una din mtd apelate arunca exceptia
	public void testGetNotaIndexInvalidJUnit4() {
		Student student = new Student();
		student.adaugaNota(10);
		student.getNota(-1);
	}
	//JUnit 5 - are un assert throws (lambda expressions)
}
