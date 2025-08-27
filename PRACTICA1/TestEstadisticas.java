/**
* public class TestEstadisticas {
* 3. Estadísticas: calcular el promedio y la desviación estándar.
*
* @author Priscila Gabriela Nina Tito
* @version 1.0 27/08/2025
*
*/
package PRACTICA1;

import java.util.Locale;
import java.util.Scanner;

public class TestEstadisticas {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros: ");
        w.useLocale(Locale.US);

        Estadisticas ec = new Estadisticas(
            w.nextDouble(), w.nextDouble(), w.nextDouble(), w.nextDouble(), w.nextDouble(), 
            w.nextDouble(), w.nextDouble(), w.nextDouble(), w.nextDouble(), w.nextDouble()
        );

        System.out.println("El promedio es: " + ec.promedio());
        System.out.println("La desviación estándar es: " + ec.desviacion());
        w.close();
    }
}