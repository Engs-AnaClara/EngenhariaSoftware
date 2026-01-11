import java.util.ArrayList;
import java.util.Random;

public class main_lista2 {
    public static void main (String[]args){
        ArrayList<String> nomes = new ArrayList<>();
        
        nomes.add("Ana");
        nomes.add("Luiz");
        nomes.add("Ándre");
        nomes.add("João");
        nomes.add("Paulo");


        Random random = new Random();
        String nomeSorteado = nomes.get(random.nextInt(nomes.size()));
        System.out.println("Nome sorteado: " + nomeSorteado );





     }
}
