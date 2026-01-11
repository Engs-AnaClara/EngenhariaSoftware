public class Lutadores {
    private String nome;
    private String nacionalidade;
    private int altura;
    private float peso;
    private String categoria;
    private int vitorias,  derrotas, empates;

    public Lutadores(String nome, String nacionalidade, int altura, float peso, String categoria, int vitorias, int derrotas, int empates ){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
        this.categoria = categoria;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        /*this.setcategoria();*/
    }
    public void apresentar(){
         System.out.println("Chegou a hora! Apresentamos o lutador: " + this.getnome());
         System.out.println("Diretamente de " + this.getnacionalidade());
         System.out.println("com" + this.altura + "m de altura");
         System.out.println("pesando" + this.getpeso() + "kg");
         System.out.println("Com" + this.vitorias + "vitórias");
         System.out.println("Com" + this.derrotas + "derrotas");
         System.out.println("Com" + this.empates + "empates");


    }
    public void status(){
        System.out.println(this.getnome() + "é um peso" + this.getcategoria());
        System.out.println("Ganhou" + this.getVitorias() + "vezes");
        System.out.println("Perdeu" + this.getDerrotas() + "vezes");
        System.out.println("Ganhou" + this.getEmpates() + "vezes");

    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    public String getnome(){
        return this.nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public String getnacionalidade(){
        return this.nacionalidade;
    }
    public void setnacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public void setaltura(int altura){
        this.altura = altura; 
    }
    public int getaltura(){
        return this.altura;
    }
    public float getpeso(){
        return this.peso;
    }
    public void setpeso(float peso){
        this.peso = peso;
    }
    public String getcategoria(){
        return this.categoria;
    }
    public void setcategoria(String categoria){
        this.categoria = categoria;
        if (this.peso <53.2){
            this.categoria = "Inválido";
        }else if (this.peso <=70.3){
            this.categoria= "Leve";
        } else if (this.peso<=83.9){
            this.categoria = "Médio";
        } else if (this.peso<=120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    public int getVitorias(){
        return this.vitorias;
    }
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }
    public int getDerrotas(){
        return this.derrotas;
    }
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }
    public int getEmpates(){
        return this.empates;
    }
    public void setEmpates(int empates){
        this.empates = empates;
    }




}      
