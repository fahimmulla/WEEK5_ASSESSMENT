import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationsTest {

	
	Calculations newcalculations = new Calculations();

	
	
	
	@Test
	public void testdivide() {
		assertFalse(newcalculations.performSum("/", 2, 2) == 3);
		assertTrue(newcalculations.performSum("/", 2, 2) == 1);
	}

	@Test
	public void testmultiply() {
		assertFalse(newcalculations.performSum("*", 2, 2) == 3);
	}
		
	@Test
	public void testadd() {
		assertFalse(newcalculations.performSum("+", 2, 2) == 3);
	}
	
	@Test
	public void testminus() {
		assertFalse(newcalculations.performSum("-", 2, 2) == 3);
	}
}