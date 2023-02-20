package junit1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.Soldado;

class SoldadoTest {
	
private Soldado p1;
private Soldado p2;


	@BeforeEach
	void setUp() throws Exception {
		//crear dos soldados  para tener uno para poder dispara a otro en el testDispar
		p1 = new Soldado();
		p2 = new Soldado();
	}

	@AfterEach
	void tearDown() throws Exception {
      p1 = null;
      p2 = null;
	}

	@Test
	public void testPuedeDisparar() {
		p1.setNumeroBalas(2);
		assertTrue(p1.puedeDisparar());
		
		p1.setNumeroBalas(0);
		assertFalse(p1.puedeDisparar());
	}
	@Test
		public void testDisparar() {
		p1.disparar(p2);
		assertTrue(p2.isEstaMuerto());
		
		p2.setNumeroBalas(5);
		int balas = p2.getNumeroBalas();
		
		p2.disparar(p1);
		assertEquals(p2.getNumeroBalas(),balas -1);
		
	}

}
