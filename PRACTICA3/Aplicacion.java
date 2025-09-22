/**
* La Clase: Aplicacion
*
* @author Priscila Gabriela Nina Tito
* @version 1.0 22/09/2025
*
*/
package PRACTICA3;

public class Aplicacion {

    public static void main(String[] args) {
        
        System.out.println("=== Juego Normal ===");
        JuegoAdivinaNumero juegoNormal = new JuegoAdivinaNumero(3);
        juegoNormal.juega();

        System.out.println("\n=== Juego Números Pares ===");
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
        juegoPar.juega();

        System.out.println("\n=== Juego Números Impares ===");
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);
        juegoImpar.juega();

        System.out.println("\n¡Todas las partidas terminadas!");
    }
}