public class Aluno extends Pessoa {
    public int matricula;

    public Aluno(String Nome, int matricula){
        super (Nome);
        this.matricula = matricula;
    }

    public void setMatricula(){
        this.matricula= matricula;
    }

    public int getMatricula(){
        return this.matricula;
    }
}
