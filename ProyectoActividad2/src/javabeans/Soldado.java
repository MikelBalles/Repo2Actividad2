package javabeans;

/**
 * La clase Soldado se utiliza para representar objetos de esta clase. 
 * Contiene las propiedades que definen a un soldado. Estas son:
 *  El número de balas que tiene y su estado de vida (vivo o muerto). 
 * 
 * Contiene los métodos con las acciones que puede realizar un soldado:
 * <ul> 
 * <li> Cálculo de la capacidad para disparar </li>
 * <li> Acción de disparar a otro objeto Soldado</li>
 * </ul>
 * 
 * @author Alejandro
 * @version 1.0
 *
 */

public class Soldado {
	
	/**
	 * Define el estado de vida de este objeto Soldado. Es un atributo booleano
	 * que solo admite true si está muerto o false si está vivo. 
	 */
	 private boolean estaMuerto;
	 
	 /**
	  * Define el numero de balas que tiene un este objeto Soldado. Admite
	  * valores numéricos y el valor mínimo siempre debe ser 0.
	  */
     private int numeroBalas;

    
    //CONSTRUCTORES DE LA CLASE
     
     /**
      * Metodo constructor de la clase que recibe todos los atributos que
      * componen la clase Soldado.
      * 
      * @param estaMuerto Estado de vida del soldado. True si está muerto
      * y false si está vivo.
      * @param numeroBalas Número de balas del soldado. El valor mínimo siempre
      * debe ser 0.
      */
     public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}
     
     /**
      * Constructor de la clase que no recibe valores. Crea un objeto de la clase
      * Soldado e inicializa los atributos a los valores por defecto: 
      * estaMuerto false
      * numeroBalas 0
      */
     public Soldado() {
		super();
	}

     
     //GETTERS AND SETTERS

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

	
	// MÉTODOS PROPIOS DE LA CLASE
	
	/**
	 * Método que calcula si este Soldado tiene capacidad para disparar. Si
	 * el número de balas (numeroBalas) es mayor que 0, el soldado podrá 
	 * disparar. De lo contrario, no podrá. 
	 * 
	 * @return true si el soldado puede disparar. false si no puede disparar.
	 */
	public boolean puedeDisparar() {
		if(this.numeroBalas > 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * Método que realiza la acción de disparar. El objeto Soldado que invoca
	 * el método dispara al objeto Soldado que llega por parámetro.
	 * 
	 * El soldado que ejecuta el método resta una bala del atributo numeroBalas.
	 * El objeto Soldado que recibe por parámetro muere. Su atributo
	 * estaMuerto cambia a true.
	 * 
	 * @param sol Objeto de la clase Soldado que muere al ser disparado. Su
	 * atributo estaMuerto cambia a true.
	 */   
	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto = true;
	}

	
	
	
}
