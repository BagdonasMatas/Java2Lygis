package app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UnitTestaiTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	
	@Test
	void maziausiasSkaicTest() {
		
		UnitTestai unitTestai = new UnitTestai();
		int[] arr = {1, 2, 3}; 
		int maz = unitTestai.maziausiasSkaic(arr);
		assertEquals(1, maz);
	}
	
	@Test
	void vidurkisSkaicTest() {
		UnitTestai unitTestai = new UnitTestai();
		int[] arr = {1, 2, 3}; 
		double vidurkis = unitTestai.vidurkisSkaic(arr);
		assertEquals(2, vidurkis);
	}
	
	@Test
	void VidurysStringTest() {
		UnitTestai unitTestai = new UnitTestai();
		String eilute = "kazkas";
		String rezEil = unitTestai.vidurysString(eilute);
			assertEquals("zk", rezEil);
	}
	
	@Test
	void balsesStringTest() {
		UnitTestai unitTestai = new UnitTestai();
		String eilute = "kazkas";
		int balses = unitTestai.balsesString(eilute);
			assertEquals(2, balses);
	}

	@Test
	void zodziaiStringTest() {
		UnitTestai unitTestai = new UnitTestai();
		String eilute = "kazkas yra negerai";
		int zodziai = unitTestai.zodziaiString(eilute);
			assertEquals(3, zodziai);
	}
	
	@Test
	void sumaSkaitmenuTest() {
		UnitTestai unitTestai = new UnitTestai();
		int skaic = 123;
		int suma = unitTestai.sumaSkaitmenu(skaic);
		assertEquals(6, suma);
	}

}
