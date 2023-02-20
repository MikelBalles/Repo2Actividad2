package javabean;
/**
 * Esta clase Jugador representa un jugador cuyos atributos son el dorsal, el número de tarjetas
 * amarillas y tarjetas rojas.
 * Está provisto de dos métodos: ponerDorsal y estaExpulsado
 * @author maria
 * @version 1.0
 *
 */

public class Jugador {

	
	/**
	 * DECLARACIÓN DE ATRIBUTOS
	 * dorsal indica el número que el jugador lleva
	 */
	private int dorsal;
	/**
	 * numeroTarjetasAmarillas indica el número de tarjetas amarillas enseñadas
	 */
	private int numeroTarjetasAmarillas;
	/**
	 * numeroTarjetasRojas indica el número de tarjetas rojas enseñadas
	 */
	private int numeroTarjetasRojas;
	
	
	//Getter&Setter
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
	 * Este método nos permite dar un valor al dorsal, que debe ser un número entero positivo
	 * menor o igual a 30.
	 * @param dorsal: numero entero positivo <=30 que será el dorsal del jugador
	 */
	public void ponerDorsal(int dorsal) {

        if(dorsal >= 1 && dorsal <= 30) {
           this.dorsal = dorsal;
        }else {       
        	this.dorsal = -1;
        	}
		}

	
	/**
	 * Este método permite saber si el jugador está expulsado o no en función de los atributos
	 * numeroTarjetasAmarillas y numeroTarjetasRojas.
	 * @return true si numeroTarjetasAmarillas = 2 o si numeroTarjetasRojas es =1
	 * @return false si numeroTarjetasAmarillas != 2 y si numeroTarjetasRojas es !=1
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
