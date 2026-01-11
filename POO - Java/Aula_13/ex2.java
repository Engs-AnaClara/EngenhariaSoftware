public class ex2 {
    private String texto;
    private String verificar;
    private String escrever;



    public void escrevertexto() {
        this.escrever = escrever;
        System.out.println("Vou escrever o texto");
    }
    public void postartexto(){
        this.texto = texto;
        System.out.println("Vou postar o texto");
    }
    public void verificarortografia(){
        this.verificar = verificar;
        System.out.println("Vou verificar o texto");
    }

    public void settexto(String texto){
        this.texto = texto;
    }
    public String gettexto(){
        return this.texto;
    }
    public String getVerificar() {
        return verificar;
    }
    public void setVerificar(String verificar) {
        this.verificar = verificar;
    }
    public String getEscrever() {
        return escrever;
    }
    public void setEscrever(String escrever) {
        this.escrever = escrever;
    }
}
