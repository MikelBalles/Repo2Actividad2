package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javabeans.Soldado;

class TestSoldado {
	
private Soldado s1;
private Soldado s2;
	
	@BeforeEach
	void setUp() throws Exception {
		s1 = new Soldado();
		s2 = new Soldado();
	}
	
	@AfterEach
	void tearDown() throws Exception {
			s1 = null;
			s2 = null;
	}	

	@Test
	public void testPuedeDisparar() {
		
		s1.setNumeroBalas(0);
		assertFalse(s1.puedeDisparar());
		
		s1.setNumeroBalas(2);
		assertTrue(s1.puedeDisparar());
		
	}
	
	@Test
	public void testDisparar() {

		s2.disparar(s1);
		assertTrue(s1.isEstaMuerto());
		
		s2.setNumeroBalas(3);
		int nb = s2.getNumeroBalas();
		
		s2.disparar(s1);
		assertEquals(nb -1, s2.getNumeroBalas());
		
	}

}
