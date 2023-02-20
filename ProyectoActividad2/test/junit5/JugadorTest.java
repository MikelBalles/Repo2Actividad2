package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javabean.Jugador;
/**
 * esta clase la usamos para realizar las pruebas unitarias de la clase Jugador
 * @author maria
 *
 */
public class JugadorTest {

	/**
	 * en este test comparamos si el dorsal introducido
	 * es positivo y <30, debe asignarse al atributo
	 */
	@Test
	public void testDorsalMenorA30() {
	//creamos un objeto de la clase Jugador
	Jugador jugador = new Jugador();
	//dotamos al atributo dorsal de valor
	jugador.setDorsal(20);;
	int resultadoEsperado = 20;
	int resultadoObtenido = jugador.getDorsal();
	
	//comparamos y deben ser iguales
	assertEquals (resultadoEsperado, resultadoObtenido);
	
	}
	
	/**
	 * en este test comprobamos que si ponemos un dorsal
	 * mayor a 30, el valor del atributo dorsal será -1
	 */
	@Test
	public void testDorsalMayorA30() {
	//creamos un objeto de la clase Jugador
	Jugador jugador2 = new Jugador();
	//dotamos al atributo dorsal de valor
	jugador2.setDorsal(40);
	int resultadoEsperado = -1;
	int resultadoObtenido = jugador2.getDorsal();
	
	//comparamos y deben ser direfentes
	assertNotEquals (resultadoEsperado, resultadoObtenido);
	
	}

	/**
	 * en este test comprobamos que si ponemos un dorsal
	 * negativo, el valor del atributo dorsal será -1
	 */
	@Test
	public void testDorsalNegativo() {
	//creamos un objeto de la clase Jugador
	Jugador jugador2 = new Jugador();
	//dotamos al atributo dorsal de valor
	jugador2.setDorsal(-6);
	int resultadoEsperado = -1;
	int resultadoObtenido = jugador2.getDorsal();
	
	//comparamos y deben ser direfentes
	assertNotEquals (resultadoEsperado, resultadoObtenido);
	
	}
	
	/**
	 * en este test comprobamos que si numeroTarjetasAmarillas
	 * es = 2, el jugador será expulsado (resultado true)
	 */
	@Test
	public void testExpulsionTarjetasAmarillas2() {
		Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasAmarillas(2);
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = jugador.estaExpulsado();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	/**
	 * en este test comprobamos que si numeroTarjetasAmarillas
	 * es < 2, el jugador no será expulsado (resultado false)
	 */
	@Test
	public void testExpulsionTarjetasAmarillasMenor2() {
		Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasAmarillas(1);
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = jugador.estaExpulsado();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	/**
	 * en este test comprobamos que si numeroTarjetasRojas
	 * es = 1, el jugador será expulsado (resultado true)
	 */
	@Test
	public void testExpulsionTarjetasRojas1() {
		Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasRojas(1);
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = jugador.estaExpulsado();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	/**
	 * en este test comprobamos que si numeroTarjetasRojas
	 * es = 0, el jugador no será expulsado (resultado false)
	 */
	@Test
	public void testExpulsionTarjetasRojas0() {
		Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasRojas(0);
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = jugador.estaExpulsado();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
}
