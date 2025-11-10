package PRACTICA4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        Empleado[] empleados = new Empleado[5];

        System.out.println("=== Ingreso de Empleados a Tiempo Completo ===");
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese nombre del empleado: ");
            String nombre = w.nextLine();
            System.out.print("Ingrese salario anual: ");
            double salarioAnual = w.nextDouble();
            w.nextLine(); 
            empleados[i] = new EmpleadoTiempoCompleto(nombre, salarioAnual);
        }

        System.out.println("\n=== Ingreso de Empleados por Horas ===");
        for (int i = 3; i < 5; i++) {
            System.out.print("Ingrese nombre del empleado: ");
            String nombre = w.nextLine();
            System.out.print("Ingrese horas trabajadas: ");
            double horas = w.nextDouble();
            System.out.print("Ingrese tarifa por hora: ");
            double tarifa = w.nextDouble();
            w.nextLine(); 
            empleados[i] = new EmpleadoTiempoHorario(nombre, horas, tarifa);
        }

        System.out.println("\n=== Lista de Empleados y Salarios ===");
        for (Empleado emp : empleados) {
            System.out.println(emp.toString());
        }

        w.close();
    }
}
