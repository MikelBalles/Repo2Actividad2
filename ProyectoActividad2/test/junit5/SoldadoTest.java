package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javabean.Soldado;

public class SoldadoTest {

	Soldado soldado = new Soldado();
	Soldado soldado2 = new Soldado();
	
	/**TEST 1. METODO PUEDEDISPARAR()
	*si el número de balas que esperamos es >0 devolverá true
	*/
	@Test
	public void testPuedeDisparar() {
		System.out.println("TEST 1. puedeDisparar");
		
		soldado.setNumeroBalas (5);
		soldado.puedeDisparar();
		int numeroBalasEsperadas= 5;
		assertEquals (numeroBalasEsperadas,soldado.getNumeroBalas());
		/*	if (numeroBalasEsperadas >0) {
				return true;
			}
			else return false;
		*/
		
	}
	
	/**TEST 2. METODO NOPUEDEDISPARAR()
	* si es un número <0 devolverá false
	* */
	@Test
	public void testNOPuedeDisparar() {
		System.out.println("TEST 2. noPuedeDisparar");
		soldado.setNumeroBalas (0);
		assertFalse (soldado.puedeDisparar());
	}
	
	/**TEST 3. DISPARAR
	* 
	*  
	*/
	@Test
	public void testDisparar() {
		System.out.println("TEST 3");
		
		soldado.setNumeroBalas(4);
		soldado.disparar(soldado2);
		soldado.getNumeroBalas();
		
		soldado2.isEstaMuerto();
		
		assertEquals(3, soldado.getNumeroBalas());
		assertTrue (soldado2.isEstaMuerto());
		
	}

}
