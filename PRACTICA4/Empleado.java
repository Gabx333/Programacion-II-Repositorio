package PRACTICA4;

public abstract class Empleado {
    public String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalarioMensual();

    public String toString() {
        return ("Empleado: " + nombre);
    }
}
