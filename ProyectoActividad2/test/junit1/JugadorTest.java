package junit1;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import clases.Jugador;

class JugadorTest {

	private Jugador p1;

 
	@BeforeEach
	void setUp() throws Exception {
		//crear un jugador  para tener uno para cada prueba 
		p1 = new Jugador();
		
	}
	
	@AfterEach
	
	void tearDown() throws Exception {
	      p1=null;
	  
	}
	
	@Test
	public void testDorsal() {
		p1.setDorsal(4);
		int resultadoEsperado = 4;
		int resultadoObtenido = p1.getDorsal();
		
     assertEquals(resultadoEsperado, resultadoObtenido);

    p1.ponerDorsal(59);
     assertEquals(-1, p1.getDorsal());


}
	@Test
	public void testEstaExpulsado() {
		p1.setNumeroTarjetasAmarillas(2);
		assertTrue(p1.estaExpulsado());
		
		p1.setNumeroTarjetasAmarillas(1);
		assertFalse(p1.estaExpulsado());
		
		
		p1.setNumeroTarjetasRojas(0);
		assertFalse(p1.estaExpulsado());
		
		
		p1.setNumeroTarjetasRojas(1);
		assertTrue(p1.estaExpulsado());
	}


		
	}


