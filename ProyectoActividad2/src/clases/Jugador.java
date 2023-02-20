package clases;
/**
 * El Objetivo de esta clase es proporcionar el <b>Estado de las amonestaciones de un jugador </b>
 * 
 * 
 * Tendra diferentes metodos sobre las amonestaciones del Jugador  tales como
 * <u> ponerDorsal y estasExpulsado</u> 
 * 
 * 
 * @author Mikel Ballesteros
 * @version 1.0
 */



public class Jugador {

	/**
	 * Atributos de la Clase Jugador que define : el dorsal del jugador en numeros enteros,
	 * numero de tarjetas amarillas y rojas tambien en numeros enteros. 
	 */
        private int dorsal;

        private int numeroTarjetasAmarillas;

        private int numeroTarjetasRojas;

             /**
              * Contructor sin parametros (vacio)
              */

public Jugador() {
			super();
		}

/**
 * Constructor con parametros
 * @param dorsal representa el dorsal del jugador
 * @param numeroTarjetasAmarillas representa el numero de tarjetas amarillas que lleva en jugador
 * @param numeroTarjetasRojas representa el numero de tarjetas rojas que lleva el jugador
 */
public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
			super();
			this.dorsal = dorsal;
			this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
			this.numeroTarjetasRojas = numeroTarjetasRojas;
		}


//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada

public int getDorsal() {
	return dorsal;
}

public void setDorsal(int dorsal) {
	this.dorsal = dorsal;
}

public int getNumeroTarjetasAmarillas() {
	return numeroTarjetasAmarillas;
}

public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
	this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
}

public int getNumeroTarjetasRojas() {
	return numeroTarjetasRojas;
}

public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
	this.numeroTarjetasRojas = numeroTarjetasRojas;
}
/**
* Metodo que establece el valor al atributo ponerDorsal en numeros enteros. 
*El numero del dorsal debe ser igual o superior a 1 y menor o igual a 30.
*   
* 
* @param dorsal, el numero del dorsal del jugador
* 	
*/

        public void ponerDorsal(int dorsal) {

                      if(dorsal >= 1 && dorsal <= 30) {

                                    this.dorsal = dorsal;

                      }else {

                                    this.dorsal = -1;

                      }

        


}

/**
 * 
 * Metodo que describe si el jugador esta expulsado dependiendo del numero de tarjetas amarillas o
 * rojas que han sido asignadas.
 * @return Devuelve expulsado en el caso de que numero de tarjetas amarillas sea igual a 2 o
 * en el caso de que tarjetas rojas sean igual a 1
 * en el caso de no tener ninguna tarjeta con los valores indicados devuelve un valor false
 */

        public boolean estaExpulsado() {

                      boolean expulsado = false;                                                  

                      if(numeroTarjetasAmarillas == 2) {

                                    expulsado = true;

                      }                          

                      if(numeroTarjetasRojas == 1) {

                                    expulsado = true;

                      }                          

                      return expulsado;

        }            

}

