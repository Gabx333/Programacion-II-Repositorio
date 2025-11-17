public class Main {
    
    public static void main(String[] args) {
        MiTeleferico mt = new MiTeleferico();

        mt.agregarCabina("Rojo");
        mt.agregarCabina("Rojo");

        mt.agregarPersonaFila(new Persona("Ana", 20, 55), "Rojo");
        mt.agregarPersonaFila(new Persona("Luis", 30, 70), "Rojo");

        Linea rojo = null;

        rojo = new Linea("Rojo"); //Solo como mi ejempo

        System.out.println("Ingresos totales: " + mt.calcularIngresos());
        System.out.println("Linea con mayor ingreso regular: " + mt.lineaMayorIngresoRegular());
    }
}
