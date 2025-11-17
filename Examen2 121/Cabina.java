import java.util.ArrayList;

public class Cabina {
    private int nroCabina;
    private Persona[] personasAbordo;

    public Cabina(int nroCabina) {
        this.nroCabina = nroCabina;
        this.personasAbordo = new Persona[10]; 
    }
    
    public float pesoActual() {
        float total = 0;
        for (Persona p : personasAbordo) {
            if (p != null) {
                total += p.getPeso();
            }
        }
        return total;
    }

    public int cantidadPersonas() {
        int c = 0;
        for (Persona p : personasAbordo) {
            if (p != null) {
                c++;
            }
        }
        return c;
    }

    public boolean agregarPersona(Persona p) { //respetando reglas
        if (cantidadPersonas() < 10 && pesoActual() + p.getPeso() <= 850) {
            for (int i = 0; i < personasAbordo.length; i++) {
                if (personasAbordo[i] == null) {
                    personasAbordo[i] = p;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean cumpleReglas() {
        return cantidadPersonas() <= 10 && pesoActual() <= 850;
    }

    public float ingresosCabina() {
        float total = 0;
        for (Persona p : personasAbordo) {
            if (p != null) {
                if (p.getEdad() < 25 || p.getEdad() > 60) {
                    total += 1.50;
                } else {
                    total += 3;
                }
            }
        }
        return total;
    }

    public float ingresosSoloRegulares() {
        float total = 0;
        for (Persona p : personasAbordo) {
            if (p != null && p.getEdad() >= 25 && p.getEdad() <= 60) {
                total += 3;
            }
        }
        return total;
    }
}
