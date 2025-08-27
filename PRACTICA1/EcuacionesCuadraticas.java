/**
* public class EcuacionesCuadraticas {
* 2. Algebra: Ecuaciones Cuadráticas
*
* @author Priscila Gabriela Nina Tito
* @version 1.0 27/08/2025
*
*/
package PRACTICA1;

public class EcuacionesCuadraticas {
    private int a;
    private int b;
    private int c;
    
    public EcuacionesCuadraticas(int a, int b, int c){ 
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminante() {
        double disc = b*b - 4*a*c;
        return disc;
    }
    public double getRaiz1(){
        double raiz1 = (-b + Math.sqrt(getDiscriminante()))/(2*a);
        return raiz1;
    }
    public double getRaiz2(){
        double raiz2 = (-b - Math.sqrt(getDiscriminante()))/(2*a);
        return raiz2;
    }
}
