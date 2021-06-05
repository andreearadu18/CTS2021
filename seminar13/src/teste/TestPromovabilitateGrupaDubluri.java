package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Grupa;
import dubluriTeste.StudentDummy;
import dubluriTeste.StudentFake;
import dubluriTeste.StudentStub;
import suite.categorii.ITestePromovabilitateCategorii;
import suite.categorii.ITesteUrgente;

public class TestPromovabilitateGrupaDubluri {

	@Test
	public void testReferenceAdaugaStud() {
		Grupa grupa = new Grupa(1080);
		grupa.adaugaStudent(new StudentDummy());
		grupa.adaugaStudent(new StudentDummy());
		assertEquals(2, grupa.getStudenti().size());
	}

	@Test
	@Category(ITestePromovabilitateCategorii.class)
	public void testReferenceCuStab() {
		Grupa grupa = new Grupa(1080);
		grupa.adaugaStudent(new StudentStub());
		grupa.adaugaStudent(new StudentStub());
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}
	
	@Test
	@Category({ITestePromovabilitateCategorii.class, ITesteUrgente.class})
	public void testReferenceCuFake() {
		Grupa grupa = new Grupa(1080);
		for(int i =0; i < 7; i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestanta(false);
			grupa.adaugaStudent(student);
		}
		for(int i =0; i < 3 ; i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestanta(true);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.7, grupa.getPromovabilitate(),0.01);
	}
}
