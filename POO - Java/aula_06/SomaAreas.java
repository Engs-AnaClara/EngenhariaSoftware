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