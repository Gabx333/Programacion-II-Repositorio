/**
* La Clase: Juego
*
* @author Priscila Gabriela Nina Tito
* @version 1.0 22/09/2025
*
*/
package PRACTICA3;

public class Juego {
    int numeroDeVidas;
    static int record;
    
    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
    }
    public void reiniciaPartida() {
    System.out.println("Partida reiniciada. Vidas: " + numeroDeVidas);
}

    public void actualizaRecord(){
        if(numeroDeVidas > record){
            record = numeroDeVidas;
            System.out.println("Nuevo record: " + record);
        } else {
            System.out.println("Record actual: " + record);
        }
    }
    public boolean quitaVida(){
        if(numeroDeVidas > 1){
            numeroDeVidas --;
            System.out.println("Vida perdida. Vidas restantes: " + numeroDeVidas);
            return true;
        } else{
            System.out.println("No te quedan vidas. Juego terminado.");
            return false;
        }
    }
}