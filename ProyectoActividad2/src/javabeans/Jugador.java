package javabeans;

/**
 * 
 * @author Javier
 * @version 2.1
 * 
 */

public class Jugador {
    /**
     * Número jugador
     */
    private int dorsal;
    /**
     * Número de tarjetas amarillas que tiene un jugador
     */
    private int numeroTarjetasAmarillas;
    /**
     * Número de tarjetas rojas que tiene un jugador
     */    
    private int numeroTarjetasRojas;
    
    
    
    
	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	public Jugador() {
		super();
	}
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
	 * Este método verifica que el dorsal es válido, estando comprendido
	 * entre los numeros 1 y 30, ambos incluidos.
	 * @param dorsal
	 */
	
    public void ponerDorsal(int dorsal) {
    	
        if(dorsal >= 1 && dorsal <= 30) {
          this.dorsal = dorsal;
        }else {
          this.dorsal = -1;
        }
	}
    
    /**
     * Este método comprueba si un jugador está expulsado. Para que el método devuelva
     * true(está expulsado), debe de cumplirse una de las siguientes condiciones:
     * El jugador tiene dos tarjetas amarillas o el jugador tiene una tarjeta roja.
     * De lo contrario el método devuelve false, indiando que el jugador no esta expulsado.
     //* @param1 numeroTarjetasAmarillas 
     //* @param2 numeroTarjetasRojas.
     * @return True si está expulsado o false si no está expulsado
     * 
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
    
    
    
    
    
    
    
    
    
    
    
    
    

