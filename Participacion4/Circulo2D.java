/**
* La Clase Circulo2D.
*
* @author Priscila Gabriela Nina Tito
* @version 1.0 08/09/2025
*
*/
package Participacion4;

public class Circulo2D {
    private double x;
    private double y;
    private double radio;

    // Constructor sin argumentos
    public Circulo2D() {
        this.x = 0;
        this.y = 0;
        this.radio = 1;
    }
    // Constructor con parámetros
    public Circulo2D(double x, double y, double radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getRadio(){
        return radio;
    }
    public double getArea(){
        return Math.PI * radio * radio;
    }
    public double getPerimetro(){
        return 2 * Math.PI * radio;
    }
    private double distancia(double x1, double y1, double x2, double y2){
        double distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return distancia;
    }
    public boolean contiene(double x, double y){
        double d = distancia(this.x, this.y, x, y);
        if (d < radio) {
            return true;
        } else {
            return false;
        }
    }
    public boolean contiene(Circulo2D otro){
        double d = distancia(this.x, this.y, otro.getX(), otro.getY());
        if (d + otro.getRadio() < this.radio) {
            return true;
        } else {
            return false;
        }
    }
    public boolean sobrepone(Circulo2D otro){
        double d = distancia(this.x, this.y, otro.getX(), otro.getY());
        if (d < (this.radio + otro.getRadio())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Circulo2D c1 = new Circulo2D(2, 0, 1);

        System.out.println("Área: " + c1.getArea());
        System.out.println("Perímetro: " + c1.getPerimetro());
        System.out.println("¿Contiene el punto (2.5,0)? " + c1.contiene(2.5, 0));
        System.out.println("¿Contiene el círculo (2,0,0.5)? " + c1.contiene(new Circulo2D(2, 0, 0.5)));
        System.out.println("¿Se sobrepone con el círculo (0,0,2)? " + c1.sobrepone(new Circulo2D(0, 0, 2)));
    }
}