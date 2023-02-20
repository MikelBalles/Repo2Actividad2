/**
 * Esta clase Soldado representa a un soldado cuyos atributos son estaMuerto y numeroBalas.
 * Está provisto del método para saber si puede disparar y disparar. 
 * @author maria
 * @version 1.0
 *
 */
public class Soldado {

	/**
	 * DECLARACIÓN DE ATRIBUTOS
	 * estaMuerto es un atributo que dará un resultado booleano
	 */
	private boolean estaMuerto;
	/**
	 * numeroBalas dará un resultado int
	 */
	private int numeroBalas;
	
	/**
	 * CONSTRUCTOR POR DEFECTO
	 */
	public Soldado() {
		super();
	}
	
	/**
	 * CONSTRUCTOR CON PARÁMETROS
	 * @param estaMuerto representa si está muerto
	 * @param numeroBalas representa rl númerro de balas disponible para disparar
	 */
	public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}


	//Getter&Setter
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
	
	
	//toString
	@Override
	public String toString() {
		return "Soldado [estaMuerto=" + estaMuerto + ", numeroBalas=" + numeroBalas + "]";
	}
	
	
	
	/**
	 * Este método nos permte saber si el soldado puede disparar balas.
	 * Teniendo en cuenta el valor int del atributo numeroBalas, si es positivo el resultado
	 * será true; si es negativo, será false.
	 * @return true si numeroBalas>0
	 * @return false si numeroBalas<0
	 */
	public boolean puedeDisparar() {
		if (this.numeroBalas > 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * Este método disminuye unidades a numeroBalas
	 * @param sol: será un int, referenciando al número de balas que dispara
	 */
	public void disparar (Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto = true;
	}
	
	
	
	
}
