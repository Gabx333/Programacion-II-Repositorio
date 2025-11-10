public class Prestamo {
    private String fechaPrestamo;
    private String fechaDevolucion;
    private Estudiante estudiante;
    private Libro libro;

    public Prestamo(String fechaPrestamo, String fechaDevolucion, Estudiante estudiante, Libro libro) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.estudiante = estudiante;
        this.libro = libro;
    }

    public void mostrarInfo() {
        System.out.println("Préstamo:");
        System.out.println("\t- Fecha de préstamo: " + fechaPrestamo);
        System.out.println("\t- Fecha de devolución: " + fechaDevolucion);
        System.out.println("\t- Libro: " + libro.getTitulo());
        System.out.println("\t- Estudiante: " + estudiante.getNombre());
    }
}
