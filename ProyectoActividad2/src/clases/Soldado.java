package clases;

/**
 * El Objetivo de esta clase es proporcionar el <b>Estado de un Soldado</b>
 * 
 * 
 * Tendra diferentes metodos sobre acciones del Soldado tales como
 * <u> puedeDisparar y disparar</u> 
 * 
 * 
 * @author Mikel Ballesteros
 * @version 1.0
 */


public class Soldado {

/**
 * Atributos de la clase soldado
 */
    private boolean estaMuerto;

    private int numeroBalas;

   
/**
 * Constructor con los atributos vacios 
 */
   
public Soldado() {
		super();
	}
/**
 * Contructor con el parametro boolen si el soldado esta muerto o no
 * @param estaMuerto
 * Contructor con el parametro entero con el numero de balas que ha recibido 
 * @param numeroBalas
 */


public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}

/*
 * Getter and Setter, no son necesarios documentarlos 
 *
 */


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
 * Metodo que describe si el soldado puede disparar dependiendo del numero del atributo numeroBalas
 * @return Devuelve true en el caso de que numeroBalas sea mayor a 0, false en el caso que sean 
 * menores a 0 
 */
    public boolean puedeDisparar() {

                  if(this.numeroBalas > 0) {

                                return true;

                  }                          

                  return false;

    }

   /**
    * Metodo que establece el valor al atributo estaMuerto. En caso de que numeroBalas sea superior
    * a 0 el metodo arroja un true  
    * 
    * @param sol el nuevo soldado que queremos reconocer
    * 	
    */

    public void disparar(Soldado sol) {

                  this.numeroBalas--;

                  sol.estaMuerto = true;

    }

}