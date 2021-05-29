package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;

public class TesteConstructorGrupa {
	
	@Test
	public void testRight() {
		Grupa grupa = new Grupa(1085);
		assertEquals(1085, grupa.getNrGrupa());
	}
	

	@Test
	public void testBoundaryLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	

	@Test
	public void testBoundaryLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testErrorLimitaInferioara() {
		Grupa grupa = new Grupa(100);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testErrorLimitaSuperioara() {
		Grupa grupa = new Grupa(7100);
	}
	
	@Test (timeout = 500)
	public void testPerformance() {
		Grupa grupa = new Grupa(1010);
	}
	
	@Test 
	public void textExistance() {
		Grupa grupa = new Grupa(1085);
		assertNotNull(grupa.getStudenti());
	}
}
