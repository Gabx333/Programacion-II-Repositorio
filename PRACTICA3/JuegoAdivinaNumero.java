/**
* La Clase: JuegoAdivinaNumero
*
* @author Priscila Gabriela Nina Tito
* @version 1.0 22/09/2025
*
*/
package PRACTICA3;
import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinaNumero extends Juego{
    int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas){
        super(numeroDeVidas);
    }
    public boolean validaNumero(int numeroEntero){
        if(numeroEntero >= 0 && numeroEntero <= 10){
            //System.out.println("Número válido.");
            return true;
        } else{
            System.out.println("Número inválido. Debe estar entre 0 y 10.");
            return false;
        }
    }
    public void juega(){
        Scanner w = new Scanner(System.in);
        super.reiniciaPartida();
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(11); //0....10
        System.out.println("Adivine un número entre el 0 y el 10.");

        while (true) {
            int numero = w.nextInt();
            //validaNumero(numero);
            if (!validaNumero(numero)) {
                continue; // vuelve a pedir número
            }
            if (numero == numeroAAdivinar){
            System.out.println("Acertaste");
            super.actualizaRecord();
            break;
            } else{
                boolean quedan = super.quitaVida();
                if (quedan) {
                    if (numero < numeroAAdivinar) {
                        System.out.println("Es mayor. Intenta de nuevo:");
                    } else {
                        System.out.println("Es menor. Intenta de nuevo:");
                    }
                } else {
                    System.out.println("El número era: " + numeroAAdivinar);
                    break;
                }
                }
            }
        // w.close(); No cerramos 'w' aquí para evitar cerrar System.in en caso de que otra parte del programa lo necesite.
    }
}