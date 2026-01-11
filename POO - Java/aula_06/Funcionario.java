public class Funcionario {
    private String nome;
    private int salario;

    public Funcionario(String nome, int salario){
        this.nome = nome;
        this.salario = 0;
    }
    public void setnome (String Nome){
        this.nome = Nome;

    }
    public String getnome(){
        return nome;
    }

    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }

}

public class Gerente extends Funcionario{
    private String Setor;

    public Gerente(String nome, int salario, String Setor){
        super (nome,salario);
        this.Setor = Setor;
        
        public String getSetor() {
        return Setor;
    }
}}
