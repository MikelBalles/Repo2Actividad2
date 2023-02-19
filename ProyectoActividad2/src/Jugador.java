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

        private int dorsal;

        private int numeroTarjetasAmarillas;

        private int numeroTarjetasRojas;

                     

//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada


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

