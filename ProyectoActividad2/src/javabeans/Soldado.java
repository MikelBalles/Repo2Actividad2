package javabeans;

/**
 * 
 *@author Javier
 *@version 1.0
 *
 */
public class Soldado {
	/**
	 * Indica el estado del soldado. True está muerto o false está vivo.
	 */
	private boolean estaMuerto;
	/**
	 * Indica el número de balas de las que dispone el soldado.
	 */
    private int numeroBalas;

	public Soldado() {
		super();
	}

	public boolean isEstaMuerto() {
		return estaMuerto;
	}

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
	
	/**
	 * Este método comprueba si el objeto tiene al menos una bala para poder disparar
	 * @return Devuelve true si el numero que recibe es mayor que cero, 
	 * si el numero que recibe es 0, devuelve false
	 */
	public boolean puedeDisparar() {
    	if(this.numeroBalas > 0) {
    		return true;
    	}                          
        return false;
    }
	
	/**
	 * Con este método disparamos al soldado que le pasamos como argumento y le 
	 * restamos un numero a su contador de balas. Si resta la bala, el atributo estaMuerto
	 * cambia de estado a true
	 * @param sol Soldado que le pasamos al método para que le disparen
	 */

    public void disparar(Soldado sol) {
        this.numeroBalas--;
        sol.estaMuerto = true;

}

}

