package junit5;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javabeans.Jugador;


class TestJugador {

	private Jugador j1;
		
		@BeforeEach
		void setUp() throws Exception {
			j1 = new Jugador();
		}
		
		@AfterEach
		void tearDown() throws Exception {
				j1 = null;
		}	

		@Test
		
		public void testPonerDorsal() {
			
			j1.ponerDorsal(5);
			
			int resultadoEsperado = 5;
			int resultadoObtenido = j1.getDorsal();
			
			assertEquals(resultadoEsperado, resultadoObtenido);
			
			j1.ponerDorsal(40);
			
			assertEquals(-1, j1.getDorsal());
		}
		
		@Test
		public void testEstaExpulsado() {
			
			j1.setNumeroTarjetasAmarillas(2);
			assertTrue(j1.estaExpulsado());
			
			j1.setNumeroTarjetasRojas(1);
			assertTrue(j1.estaExpulsado());
			
			j1.setNumeroTarjetasAmarillas(1);
			j1.setNumeroTarjetasRojas(0);
			assertFalse(j1.estaExpulsado());
			
			
		}
		
		
		
	
		
	

}
