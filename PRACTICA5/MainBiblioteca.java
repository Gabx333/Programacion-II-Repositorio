import java.util.ArrayList;

public class MainBiblioteca {
    
    public static void main(String[] args) {
        // Crear contenido de páginas para un libro
        ArrayList<String> contenido = new ArrayList<>();
        contenido.add("Capítulo 1: Introducción a la programación.");
        contenido.add("Capítulo 2: Variables y tipos de datos.");
        contenido.add("Capítulo 3: Estructuras de control.");

        // Crear entidades
        Libro libro1 = new Libro("Fundamentos de Programación", "978-84-9123-456-7", contenido);
        Autor autor1 = new Autor("Alan Turing", "Británica");
        Estudiante estudiante1 = new Estudiante("INF-001", "Gabriela Nina");

        // Crear biblioteca (con clase interna Horario)
        Biblioteca biblioteca = new Biblioteca("Biblioteca UMSA", "Lunes a Viernes", "08:00", "18:00");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarAutor(autor1);

        biblioteca.prestarLibro(estudiante1, libro1, "2025-11-09", "2025-11-16");

        biblioteca.mostrarEstado();

        System.out.println("\n=== Lectura de libro ===");
        libro1.leer();

        biblioteca.cerrarBiblioteca();
    }
}
