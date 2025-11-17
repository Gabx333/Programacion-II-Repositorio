import java.util.ArrayList;

public class MiTeleferico {
    private float cantidadIngresos;
    private Linea[] lineas;

    public MiTeleferico() {
        lineas = new Linea[3];
        lineas[0] = new Linea("Amarillo");
        lineas[1] = new Linea("Rojo");
        lineas[2] = new Linea("Verde");
    }

    private Linea getLinea(String color) {
        for (Linea l : lineas) {
            if (l.getColor().equalsIgnoreCase(color)) return l;
        }
        return null;
    }

    public void agregarPersonaFila(Persona p, String linea) {
        Linea l = getLinea(linea);
        if (l != null) {
            l.agregarPersona(p);
        }
    }

    public void agregarCabina(String linea) {
        Linea l = getLinea(linea);
        if (l != null) {
            l.agregarCabina((int) (Math.random() * 1000));
        }
    }

    public float calcularIngresos() {
        cantidadIngresos = 0;
        for (Linea l : lineas) {
            cantidadIngresos += l.ingresosTotales();
        }
        return cantidadIngresos;
    }

    public String lineaMayorIngresoRegular() {
        float max = -1;
        String nombre = "";

        for (Linea l : lineas) {
            float ing = l.ingresosRegulares();
            if (ing > max) {
                max = ing;
                nombre = l.getColor();
            }
        }
        return nombre;
    }
}