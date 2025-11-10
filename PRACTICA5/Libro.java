import java.util.ArrayList;

public class Libro {
    private String titulo;
    private String isbn;
    private ArrayList<Pagina> paginas;

    //Constructor que recibe título, ISBN y contenido de las páginas
    public Libro(String titulo, String isbn, ArrayList<String> contenidoPaginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = new ArrayList<>();

        int numero = 1;
        for (String contenido : contenidoPaginas) {
            paginas.add(new Pagina(numero++, contenido));
        }
    }

    public void leer() {
        System.out.println("Leyendo el libro: " + titulo + " (ISBN: " + isbn + ")");
        for (Pagina p : paginas) {
            p.mostrarContenido();
        }
        System.out.println("=========================================");
    }
    public String getTitulo() {
        return titulo;
    }
    private class Pagina {
        private int numero;
        private String contenido;

        public Pagina(int numero, String contenido) {
            this.numero = numero;
            this.contenido = contenido;
        }

        public void mostrarContenido() {
            System.out.println("* Página " + numero + ": " + contenido);
        }
    }
}
