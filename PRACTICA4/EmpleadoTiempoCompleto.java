package PRACTICA4;

public class EmpleadoTiempoCompleto extends Empleado {
    public double salario_anual;

    public EmpleadoTiempoCompleto(String nombre, double salario_anual) {
        super(nombre);
        this.salario_anual = salario_anual;
    }
    @Override
    public double calcularSalarioMensual(){
        return (this.salario_anual / 12);
    }

    public String toString(){
        return (super.toString() + "\nSalario Anual: " + this.salario_anual + "\nSalario Mensual: " + calcularSalarioMensual());
    }
}
