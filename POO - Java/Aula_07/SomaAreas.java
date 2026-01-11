package Aula07;

import java.util.ArrayList;

public class SomaAreas {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Forma(2, 3));
        formas.add(new Retangulo(5, 4)); 
        formas.add(new Circulo(3, 3)); 

        int somaAreas = 0;

        for (Forma forma : formas) {
            System.out.println("Área: " + forma.area());
            System.out.println(forma);
            somaAreas += forma.area();
        }
        
        System.out.println("Soma total das áreas: " + somaAreas);
    }
}