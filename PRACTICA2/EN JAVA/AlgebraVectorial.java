/**
* La Clase: Algebra Vectorial
*
* @author Priscila Gabriela Nina Tito
* @version 1.0 15/09/2025
*
*/
package PRACTICA2;

public class AlgebraVectorial{
    private double x;
    private double y;   
    private double z;

    public AlgebraVectorial(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public AlgebraVectorial(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public AlgebraVectorial(AlgebraVectorial otro){
        this.x = otro.x;
        this.y = otro.y;
        this.z = otro.z;
    }
    public AlgebraVectorial suma(AlgebraVectorial otro){
        return new AlgebraVectorial(this.x + otro.x, this.y + otro.y, this.z + otro.z);
    }
    public AlgebraVectorial resta(AlgebraVectorial otro){
        return new AlgebraVectorial(this.x - otro.x, this.y - otro.y, this.z - otro.z);
    }
    public double modulo(){
        return Math.sqrt(x*x + y*y + z*z);
    }
    // (1) determinar si dos vectores son perpendiculares
    public boolean perpendicular1(AlgebraVectorial otro) {
        if(this.suma(otro).modulo() == this.resta(otro).modulo()) {
            return true;
        } else {
            return false;
        }
    }
    public boolean perpendicular2(AlgebraVectorial otro) {
        if(this.resta(otro).modulo() == otro.resta(this).modulo()) {
            return true;
        } else {
            return false;
        }
    }
    public boolean perpendicular3(AlgebraVectorial otro) {
        if (this.x * otro.x + this.y * otro.y + this.z * otro.z == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean perpendicular4(AlgebraVectorial otro) {
        if(Math.pow( this.suma(otro).modulo(), 2) == (Math.pow(this.modulo(), 2) + Math.pow(otro.modulo(), 2))) {
            return true;
        } else {
            return false;
        }
    }
    // (2) determinar si dos vectores son paralelos
    public boolean paralela1(AlgebraVectorial otro) {
        if ((this.x * otro.y == this.y * otro.x) && (this.x * otro.z == this.z * otro.x) && (this.y * otro.z == this.z * otro.y)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean paralela2(AlgebraVectorial otro) {
        if (this.y * otro.z - this.z * otro.y == 0 && this.z * otro.x - this.x * otro.z == 0 && this.x * otro.y - this.y * otro.x == 0) {
            return true;
        } else {
            return false;
        }
    }
    // (3) determinar la proyección de dos vectores,
    public AlgebraVectorial proyeccion_de_a_sobre_b(AlgebraVectorial otro) {
        double producto = this.x * otro.x + this.y * otro.y + this.z * otro.z;
        double modulo2 = otro.x*otro.x + otro.y*otro.y + otro.z*otro.z;
        double escalar = producto / modulo2;
        return new AlgebraVectorial(otro.x * escalar, otro.y * escalar, otro.z * escalar);
    }
    // (4) determinar el componente de dos vectores.
    public double componente_de_a_en_b(AlgebraVectorial otro) {
        double producto = this.x * otro.x + this.y * otro.y + this.z * otro.z;
        double modulo2 = otro.modulo();
        double escalar = producto / modulo2;
        return escalar;
    }
    // 2.
    // a) Suma de dos vectores a y b
    public AlgebraVectorial sumaVectores(AlgebraVectorial otro) {
        return this.suma(otro);
    }
    // b) Multiplicaci´on de un escalar r por un vector a
    public AlgebraVectorial multiplicacionEscalarR(double r) {
        return new AlgebraVectorial(this.x * r, this.y * r, this.z * r);
    }
    // c) Longitud de un vector a:
    public double longitudVector() {
        return this.modulo();
    }
    // d) Normal de un vector a
    public AlgebraVectorial normalVector() {
        return new AlgebraVectorial(this.x / this.modulo(), this.y / this.modulo(), this.z / this.modulo());
    }
    // e) Producto escalar de a y b
    public double productoEscalar(AlgebraVectorial otro) {
        return (this.x * otro.x + this.y * otro.y + this.z * otro.z);
    }
    // f) Producto vectorial de a y b
    public AlgebraVectorial productoVectorial(AlgebraVectorial otro) {
        return new AlgebraVectorial(this.y * otro.z - this.z * otro.y, this.z * otro.x - this.x * otro.z, this.x * otro.y - this.y * otro.x);
    }
}