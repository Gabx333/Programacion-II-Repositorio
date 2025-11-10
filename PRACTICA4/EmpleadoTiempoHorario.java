package PRACTICA4;

public class EmpleadoTiempoHorario extends Empleado {
    public double horas_trabajadas;
    public double tarifa_por_hora;

    public EmpleadoTiempoHorario(String nombre, double horas_trabajadas, double tarifa_por_hora){
        super(nombre);
        this.horas_trabajadas = horas_trabajadas;
        this.tarifa_por_hora = tarifa_por_hora;
    }

    @Override
    public double calcularSalarioMensual(){
        return horas_trabajadas * tarifa_por_hora;
    }

    public String toString(){
        return ("Nombre del empleado: " + nombre + "\nHoras trabajadas: " + horas_trabajadas + "\nTarifa por hora: " + tarifa_por_hora + "\nSalario Mensual: " + calcularSalarioMensual());
    }
}