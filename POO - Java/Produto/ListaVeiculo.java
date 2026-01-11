
import java.util.ArrayList;

public class ListaVeiculo {
    

    public static void testarMovimento(Veiculo veiculo) {
        System.out.println("Testando: " + veiculo);
        veiculo.mover();
        System.out.println("----------");
    }
    
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        
        veiculos.add(new Veiculo("Volvo", 50));
        veiculos.add(new Carro("Toyota", 120)); 
        veiculos.add(new Bicicleta("Mitsubishi", 25)); 
        
        System.out.println("Lista");
        for (Veiculo veiculo : veiculos) {
            veiculo.mover();
            System.out.println(veiculo);
        }
        
        System.out.println("Metodo");
        
        testarMovimento(new Carro("Honda", 100));
        testarMovimento(new Bicicleta("Ferrari", 20));
        testarMovimento(new Veiculo("Hyndai", 30));
    }
}