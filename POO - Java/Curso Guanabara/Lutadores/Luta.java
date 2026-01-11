import java.util.Random;

public class Luta {

    private Lutadores desafiado;
    private Lutadores desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutadores l1, Lutadores l2){
        if (l1.getcategoria() == (l2.getcategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
            System.out.println("Sucesso! Os lutadores são da mesma categoria");
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null; 
            System.out.println("Erro! Os lutadores são de categorias diferentes");
        }
    }

    public void lutar(){
        if (this.aprovada){
            System.out.println("A luta foi aprovada");
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0: 
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1:
                    System.out.println("O vendecedor foi o: " + this.desafiado);
                    this.desafiado.ganharLuta();
                    this.desafiado.perderLuta();
                    break;

                case 2:
                    System.out.println("O vencedor foi o:" +
                    this.desafiante.getnome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }


        } else { System.out.println("A luta não foi aprovada");}}

    public Lutadores getdesafiado(){
        return this.desafiado;
    }
    public void setdesafiado(Lutadores desafiado){
        this.desafiado = desafiado;
    } 
    public Lutadores getdesafiante(){
        return this.desafiante;
    }
    public void setdesafiante(Lutadores desafiante){
        this.desafiante = desafiante;
    }
}




