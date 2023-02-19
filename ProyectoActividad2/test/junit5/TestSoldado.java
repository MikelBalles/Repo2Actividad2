package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javabeans.Soldado;

/*
 * Clase que contiene pruebas para todos los métodos de la 
 * clase Soldado
 *
 */
class TestSoldado {
	
	private Soldado soldadoDemo;
	
	
	//Creamos un soldado con el constructor vacío antes de cada test

	@BeforeEach
	void setUp() throws Exception {
		soldadoDemo = new Soldado();
	}
	
	//Reseteamos el objeto Soldado creado para eliminar cualquier modificación anterior
	@AfterEach
	void resetearSoldado () {
		soldadoDemo = null;
	}
	
	
	/*
	 * Comprobamos si el constructor con todos los atributos funciona correctamente
	 */
	@Test 
	void testConstructor() {
		soldadoDemo = new Soldado(true, 10);
		assertTrue(soldadoDemo.isEstaMuerto());
		assertEquals(10, soldadoDemo.getNumeroBalas());
	}
	
	
	/*
	 * Comprobamos si el constructor vacío funciona correctamente 
	 * Por defecto, debe crear un solado vivo y con 0 balas.
	 */
	@Test
	void testConstructorVacio() {
		soldadoDemo = new Soldado();
		assertFalse(soldadoDemo.isEstaMuerto());
		assertEquals(0,soldadoDemo.getNumeroBalas());
	}
	
	
	/*
	 * Comprobamos si el soldado tiene capacidad para disparar solo cuando tiene
	 * más de 0 balas.
	 * No pobramos cuando tiene balas negativas porque no está contemplado ese
	 * comportamiento en el código. 
	 */
	@Test
	void testCapacidadDisparar() {
		soldadoDemo.setNumeroBalas(5);
		assertTrue(soldadoDemo.puedeDisparar());
		
		soldadoDemo.setNumeroBalas(0);
		assertFalse(soldadoDemo.puedeDisparar());
	}
	
	/*
	 * Comprobamos el funcionamiento del metdoo disparar(sol). Debe restar
	 * una bala al jugador que disparar y cambiar el estado a muerto al jugador
	 * que ha disparado. 
	 */
	@Test
	void testAccionDisparar() {
		
		//Creamos los soldado que participan
		soldadoDemo.setNumeroBalas(1);
		Soldado sold2 = new Soldado(false,5);
		
		soldadoDemo.disparar(sold2);
		assertTrue(sold2.isEstaMuerto());
		assertEquals(0,soldadoDemo.getNumeroBalas());

		
		
		
		
	}


}
