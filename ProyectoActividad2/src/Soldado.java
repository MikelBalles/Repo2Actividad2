
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


    private boolean estaMuerto;

    private int numeroBalas;

   

   
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