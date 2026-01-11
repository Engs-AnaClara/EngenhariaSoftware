import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cidades {

    public static void main(String[] args) {

    List<String> cidade = new ArrayList<>();

    cidade.add("Curitiba");
    cidade.add("Porto Alegre");
    cidade.add("Floripa");

    String x = cidade.get(0);

    System.out.println(x);

    Map<Integer, String> Estado = new HashMap<>();

    Estado.put(1, "Paraná" );
    Estado.put( 2, "Rio Grande do Sul");
    Estado.put(3, "Santa Catarina");

    System.out.println(cidade.get(0) + " pertecente ao Estado do  " + Estado.get(1));
    System.out.println(cidade.get(1) + " pertecente ao Estado do  " + Estado.get(2));
    System.out.println(cidade.get(2) + " pertecente ao Estado de  " + Estado.get(3));

        Map<String, List<String>> mapa = new HashMap<>();
        
    adicionarCidade(mapa, "Paraná", "Curitiba");
    adicionarCidade(mapa, "Paraná", "Londrina");
    adicionarCidade(mapa, "Paraná", "Maringá");
    
    System.out.println("\nCidades do Paraná: " + cidadesDoEstado(mapa, "Paraná"));
    }
   
    public static void adicionarCidade(Map<String,List<String>> mapa, String estado, String cidade){
        if (!mapa.containsKey(estado)) {
        mapa.put(estado, new ArrayList<>());
        }
        
        mapa.get(estado).add(cidade);
    }
        public static List<String> cidadesDoEstado(Map<String, List<String>> mapa, String estado){
        return mapa.get(estado);
}
    }


