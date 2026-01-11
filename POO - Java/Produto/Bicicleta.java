
public class Bicicleta extends Veiculo {
    
    public Bicicleta(String marca, int velocidade) {
        super(marca, velocidade);
    }
    
    @Override
    public void mover() {
        System.out.println("Bicicleta pedalando");
    }
}