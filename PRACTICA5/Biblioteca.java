import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;
    private ArrayList<Autor> autores;
    private ArrayList<Prestamo> prestamos;
    private Horario horario;

    public Biblioteca(String nombre, String dias, String horaApertura, String horaCierre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.horario = new Horario(dias, horaApertura, horaCierre);
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }

    public void prestarLibro(Estudiante estudiante, Libro libro, String fechaPrestamo, String fechaDevolucion) {
        Prestamo p = new Prestamo(fechaPrestamo, fechaDevolucion, estudiante, libro);
        prestamos.add(p);
    }

    public void mostrarEstado() {
        System.out.println("\n================= Estado de la Biblioteca: " + nombre + " =====================");
        horario.mostrarHorario();

        System.out.println("\n* Libros registrados:");
        for (Libro l : libros) {
            System.out.println("- " + l.getTitulo());
        }
        System.out.println("\n* Autores registrados:");
        for (Autor a : autores) {
            a.mostrarInfo();
        }
        System.out.println("\n* Préstamos activos:");
        for (Prestamo p : prestamos) {
            p.mostrarInfo();
            //System.out.println();
        }
        System.out.println("=========================================");
    }

    public void cerrarBiblioteca() {
        System.out.println("\n* La biblioteca '" + nombre + "' está cerrando...");
        prestamos.clear(); // los préstamos dejan de existir
        System.out.println("\t -Todos los préstamos han sido eliminados.");
        System.out.println("====================La biblioteca está ahora cerrada=========================");
    }

    private class Horario { //Como clases internas
        private String dias;
        private String horaApertura;
        private String horaCierre;

        public Horario(String dias, String horaApertura, String horaCierre) {
            this.dias = dias;
            this.horaApertura = horaApertura;
            this.horaCierre = horaCierre;
        }

        public void mostrarHorario() {
            System.out.println("* Horario: " + dias + ", " + horaApertura + " - " + horaCierre);
        }
    }
}