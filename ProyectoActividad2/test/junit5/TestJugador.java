package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javabeans.Jugador;

class TestJugador {

	//Creamos dos jugadores de prueba
	Jugador jugDemo = null;
	Jugador jugDemo2 = null;
	Jugador jugDemo3 = null;


	
	//Establecemos null el jugador de prueba antes de cada test.
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Jugador jugDemo = null;
		Jugador jugDemo2 = null;
		Jugador jugDemo3 = null;
	}
	
	
	/*
	 * Utilizamos los métodos constructores para comprobar que el método 
	 * ponerDorsal() está funcionando correctamente.
	 */
	//Test de métodos constructores con parámetros
	@Test
	void testConstructorParametrosCorrectos() {
		jugDemo = new Jugador(5, 2, 1);
		assertEquals(5, jugDemo.getDorsal());
		assertEquals(2, jugDemo.getNumeroTarjetasAmarillas());
		assertEquals(1, jugDemo.getNumeroTarjetasRojas());		
		
		jugDemo2 = new Jugador(1, 0, 0);
		assertEquals(1, jugDemo2.getDorsal());
		assertEquals(0, jugDemo2.getNumeroTarjetasAmarillas());
		assertEquals(0, jugDemo2.getNumeroTarjetasRojas());	
		
		jugDemo3 = new Jugador(30, 1, 1);
		assertEquals(30, jugDemo3.getDorsal());
		assertEquals(1, jugDemo3.getNumeroTarjetasAmarillas());
		assertEquals(1, jugDemo3.getNumeroTarjetasRojas());	
	}
	
	@Test
	void testConstructorParametrosIncorrectos() {
		jugDemo = new Jugador(80, 0, 0);
		assertEquals(-1, jugDemo.getDorsal());
		assertEquals(0, jugDemo.getNumeroTarjetasAmarillas());
		assertEquals(0, jugDemo.getNumeroTarjetasRojas());	
		
		jugDemo2 = new Jugador(0, 0, 0);
		assertEquals(-1, jugDemo2.getDorsal());
		assertEquals(0, jugDemo2.getNumeroTarjetasAmarillas());
		assertEquals(0, jugDemo2.getNumeroTarjetasRojas());	
	}
	
	//Test de métodos constructores sin parámetros
	@Test
	void testConstructorsinParametros() {
		jugDemo = new Jugador();
		assertEquals(-1, jugDemo.getDorsal());
		assertEquals(0, jugDemo.getNumeroTarjetasAmarillas());
		assertEquals(0, jugDemo.getNumeroTarjetasRojas());	
	}
	
	
	//Test de Setter para el dorsal.
	@Test
	void testSetterDorsal() {
		jugDemo = new Jugador();
		jugDemo2 = new Jugador();
		jugDemo3 = new Jugador();
		
		jugDemo.setDorsal(1);
		assertEquals(1, jugDemo.getDorsal());
		
		jugDemo2.setDorsal(30);
		assertEquals(30, jugDemo2.getDorsal());
		
		jugDemo3.setDorsal(0);
		assertEquals(-1, jugDemo3.getDorsal());
	}
	
	
	// Probamos método estaExpulsado()
	@Test
	void testEstaExpulsado () {
		jugDemo = new Jugador(1,2,0);
		jugDemo2 = new Jugador(1,1,1);
		jugDemo3 = new Jugador (1,1,0);
		
		assertTrue(jugDemo.estaExpulsado());
		assertTrue(jugDemo2.estaExpulsado());
		assertFalse(jugDemo3.estaExpulsado());
		
		//Reseteamos jugDemo para que tenga 0 tarjetas
		jugDemo.setNumeroTarjetasAmarillas(0);
		jugDemo.setNumeroTarjetasRojas(0);
		assertFalse(jugDemo.estaExpulsado());



		
	}
	

	


}
