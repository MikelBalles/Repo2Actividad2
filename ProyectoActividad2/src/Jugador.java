

public class Jugador {

        private int dorsal;

        private int numeroTarjetasAmarillas;

        private int numeroTarjetasRojas;

                     

//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada



        public void ponerDorsal(int dorsal) {

                      if(dorsal >= 1 && dorsal <= 30) {

                                    this.dorsal = dorsal;

                      }else {

                                    this.dorsal = -1;

                      }

        }

       

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

