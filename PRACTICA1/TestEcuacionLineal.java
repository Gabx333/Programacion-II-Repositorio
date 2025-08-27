/**
* CLASE PRINCIPAL: public class TestEcuacionLineal {
* 1. Algebra: ecuación lineal 2 x 2.
*
* @author Priscila Gabriela Nina Tito
* @version 1.0 27/08/2025
*
*/
package PRACTICA1;

import java.util.Scanner;

public class TestEcuacionLineal {

    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        //EcuacionLineal ec = new EcuacionLineal(w.nextInt(),w.nextInt(),w.nextInt(),w.nextInt(),w.nextInt(),w.nextInt());
        EcuacionLineal ec = new EcuacionLineal(
            w.nextInt(), w.nextInt(), w.nextInt(),
            w.nextInt(), w.nextInt(), w.nextInt()
        );

        if (ec.tieneSolucion() == 1) {
            System.out.println("x = " + ec.getX() + ", y = " + ec.getY());
        } else {
            System.out.println("La ecuación no tiene solución");
        }
        w.close();
    }
    
}
