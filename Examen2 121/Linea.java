import java.util.ArrayList;

public class Linea {
    private String color;
    private Persona[] filaPersonas;
    private Cabina[] cabinas;
    private int cantCabinas;

    public Linea(String color) {
        this.color = color;
        filaPersonas = new Persona[50]; 
        cabinas = new Cabina[20];
        cantCabinas = 0;
    }

    public void agregarPersona(Persona p) {
        for (int i = 0; i < filaPersonas.length; i++) {
            if (filaPersonas[i] == null) {
                filaPersonas[i] = p;
                return;
            }
        }
    }

    public void agregarCabina(int nroCab) {
        if (cantCabinas < cabinas.length) {
            cabinas[cantCabinas++] = new Cabina(nroCab);
        }
    }

    private Persona obtenerPrimeroFila() {
        for (int i = 0; i < filaPersonas.length; i++) {
            if (filaPersonas[i] != null) {
                Persona p = filaPersonas[i];
                filaPersonas[i] = null;
                return p;
            }
        }
        return null;
    }

    public boolean subirPrimeraPersona(int nroCabina) {
        Persona primero = obtenerPrimeroFila();
        if (primero == null) {
            return false;
        }
        for (Cabina c : cabinas) {
            if (c != null && c.cumpleReglas() && c.agregarPersona(primero)) {
                return true;
            }
        }
        return false;
    }

    public boolean reglasCorrectas() {
        for (Cabina c : cabinas) {
            if (c != null && !c.cumpleReglas()) {
                return false;
            }
        }
        return true;
    }

    public float ingresosTotales() {
        float total = 0;
        for (Cabina c : cabinas) {
            if (c != null) {
                total += c.ingresosCabina();
            }
        }
        return total;
    }

    public float ingresosRegulares() {
        float total = 0;
        for (Cabina c : cabinas) {
            if (c != null) {
                total += c.ingresosSoloRegulares();
            }
        }
        return total;
    }

    public String getColor() {
        return color;
    }
}
