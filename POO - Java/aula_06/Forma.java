public class Forma {
    public int altura;
    public int largura;

    public Forma(int altura, int largura){
        this.altura = altura;
        this.largura = largura;
        }
}

public int area(){
    return 0;
}
public void circulo; (){
    System.out.println("O valor do circulo é: ");


}

public void retangulo; (){
    System.out.println("O valor do retabgulo é: ");
}

import java.util.ArrayList;

    public class SomaAreas{
        public statuc voip main (String[] args){
            ArrayList<Forma> formas = new ArrayList<>();

            formas.add(new Animal("bartolomeu", 20));
            formas.add(new Cachorro("pitchuco", 5)); 
            formas.add(new Gato("sushi", 10)); 

            for (Forma formas : formas) {
                formas.falar();
                System.out.println(formas);}

        }
    }