/**
* La Clase: JuegoAdivinaImpar
*
* @author Priscila Gabriela Nina Tito
* @version 1.0 22/09/2025
*
*/
package PRACTICA3;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    public boolean validaNumero(int numero) {
        if (super.validaNumero(numero)) {
            if (numero % 2 != 0) {
                return true;
            } else {
                System.out.println("Número inválido. Debe ser impar. Intenta de nuevo:");
                return false;
            }
        }
        return false;
    }
}
