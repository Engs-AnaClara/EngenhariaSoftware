import java.util.ArrayList;
import java.util.Random;

public class Lista{
    private ArrayList<String> nomes;
    private Random gerador;

    public Lista() {
        this.nomes = new ArrayList<>();
        this.gerador = new Random();
    }

    public void adicionarNome(String nome) {
        this.nomes.add(nome);
    }

    public String Lista () {
        if (nomes.isEmpty()) {
            return null;
        }
        return nomes.get(gerador.nextInt(nomes.size()));
    }
}