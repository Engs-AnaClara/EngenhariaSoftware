public class Aluno {
    private String nome;
    private int nota;
    

    public Aluno(String nome){
        this.nome = "";
        this.nota = 0;
    }

    public String getnome(){
        return this.nome;
    }
    public void setnome( String nome){
        this.nome = nome;
    }

    public int getnota(){
        return this.nota;
    }


    public void adicionar_nota(int nota){
        if (this.nota >=0 && this.nota <= 10){
            this.nota = nota;
            System.out.println ("Nota aceita");
        }else{
           System.out.println("Nota inválida");
        }}

    public void retirar_nota(){
        if (this.nota > 0){
            System.out.println ("Retirar nota = " + this.nota + "foi removida");
            this.nota = 0;
        }else{
           System.out.println("Nota inválida");
        }}

    public void consultar_nota(){
        System.out.println("O aluno " +  this.nome + "Obteve a nota " + this.nota);

    }

}

