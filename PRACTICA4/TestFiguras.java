package PRACTICA4;

import java.util.Random;

public class TestFiguras {
    public static void main(String[] args) {
        Random rnd = new Random();
        Figura[] figuras = new Figura[5];
        String[] colores = {"Rojo", "Verde", "Azul", "Amarillo", "Negro"};

        for (int i = 0; i < figuras.length; i++) {
            int tipo = rnd.nextInt(2) + 1; // 1=Cuadrado, 2=Circulo
            String color = colores[rnd.nextInt(colores.length)];

            if (tipo == 1) { // Cuadrado
                double lado = rnd.nextInt(10) + 1;
                figuras[i] = new Cuadrado(lado, color);
            } else { // Circulo
                double radio = rnd.nextInt(10) + 1;
                figuras[i] = new Circulo(radio, color);
            }
        }

        // Mostrar información
        for (Figura f : figuras) {
            System.out.println(f);
            System.out.printf("Área: %.2f, Perímetro: %.2f%n", f.area(), f.perimetro());

            // Verificar si implementa Coloreado
            if (f instanceof Coloreado) {
                System.out.println(((Coloreado) f).comoColorear());
            }

            System.out.println("-----------------------");
        }
    }
}
