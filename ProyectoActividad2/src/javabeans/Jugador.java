package javabeans;

/**
 * Esta clase se utiliza para crear objetos de la clase Jugador. Contiene
 * los atributos por los que se define un jugador: dorsal del jugador, 
 * número de tarjetas amarillas y número de tarjetas rojas. 
 * 
 * Contiene también los métodos a los que puede llamar un objeto de la clase
 * Jugador. 
 * 
 * @author Alejandro
 * @version 1.0
 *
 */

public class Jugador {
	
	/**
	 * El dorsal es un número que identifica al jugador. Debe ser un número
	 * entre el 1 y el 30, ambos incluidos.
	 * 
	 * El valor será -1 cuando se intente asignar un valor diferente a los 
	 * permitidos o cuando se cree un objeto Jugador sin definir un 
	 * número de dorsal concreto.
	 */
	private int dorsal;
	
	/**
	 * Indica el número de tarjetas amarillas que tiene un jugador. 
	 * El número mínimo es 0 y el máximo es 2.
	 */
	private int numeroTarjetasAmarillas;
	
	/**
	 * Indica el número de tarjetas rojas que tiene un jugador en un partido
	 * El número mínimo es 0 y el número máximo es 1. 
	 */
	private int numeroTarjetasRojas;
	
	//CONSTRUCTORES
	
	
	/**
	 * Constructor de la clase Jugador con todos los atributos.
	 *  
	 * @param dorsal Número que identifica al jugador. 
	 * Debe ser un número entre el 1 y el 30, ambos incluidos. En caso de que no
	 * cumpla condición, el dorsal asignado será -1.
	 * @param numeroTarjetasAmarillas Número de tarjetas amarillas que tiene
	 *  un jugador en un partido.  El número mínimo es 0 y el máximo es 2.
	 * @param numeroTarjetasRojas Número de tarjetas rojas que tiene un jugador
	 *  en un partido el número mínimo es 0 y el número máximo es 1.
	 */
    public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		ponerDorsal(dorsal); //Utilizamos el método propio para controlar la inserción
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
    
    /**
     * Constructor del método que no recibe ningún atributo. El dorsal del jugador
     * se establece en -1, dado que 0 no es un valor válido. 
     * El resto de atributos se inicializan a 0. 
     */
    public Jugador() {
    	super();
    	ponerDorsal(-1);
    }
	
	
	//GETTER AND SETTER
    
	public int getDorsal() {
		return dorsal;
	}
	/**
	 * Se establece un número de dorsal para el jugador. Se utiliza el método
	 * propio ponerDorsal para controlar que el valor esté dentro de los
	 * establecidos. 
	 * 
	 * @param dorsal Número que identifica al jugador. 
	 * Debe ser un número entre el 1 y el 30, ambos incluidos. En caso de que no
	 * cumpla condición, el dorsal asignado será -1.
	 */
	public void setDorsal(int dorsal) {
		ponerDorsal(dorsal);
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
	
	
	//MÉTODOS PROPIOS
	
	/**
	 * Método que sirve para controlar que el dorsal del Jugador esté dentro
	 * de los valores aceptados. Se emplea en los métodos de la clase que 
	 * establecen un dorsal: Los dos constructores y el método setDorsal()
	 * 
	 * Si el valor no se encuentra dentro de los contemplados, el número
	 * de dorsal asignado será -1.
	 * 
	 * @param dorsal Número que identifica al jugador. 
	 * Debe ser un número entre el 1 y el 30, ambos incluidos.
	 */
    public void ponerDorsal(int dorsal) {

    	if(dorsal >= 1 && dorsal <= 30) {
    		this.dorsal = dorsal;
    	}else {
    		this.dorsal = -1;
    	}
    }
    

/**
 * Método booleano que indica si un jugador está expulsado del partido o no. 
 * El jugador está expulsado cuando: Su número de tarjetas amarillas sea 
 * 2 o cuando reciba 1 tarjeta roja. 
 * En el resto de casos, el jugador no estará expulsado. 
 * 
 * @return true indica que el jugador es expulsado del partido. false indica
 * que el jugador no está expulsado del partido.
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
