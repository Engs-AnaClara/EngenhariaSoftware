package Caneta;

public class Caneta {
    String modelo;
    String cor;
    String ponta;
    String tamanho;
    int carga;
    boolean tampada;
    public Method sMethod()

    void status(){
        System.out.println("Modelo " + this.modelo);
        System.out.println("Caneta de cor " + this.cor);
        }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Não posso rabiscar");
        } else {
            System.out.println("Ótimo, vamos rabiscar");
        }
        }

    }
    void desenhar(){

    }
    
    void escrever(){


    }
    void tampar(){
        System.out.print("Uma caneta" + this.tampada);

    }

    void destampar(){

    }

    
    public static void main(String[] args) {
        
    }
}
