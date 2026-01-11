package Atividades2;

public class Aluno {
    private String Nome;
    private int Matricula;
    private String Curso;   


    public Aluno(String Nome, String Curso, int Matricula) {
        this.Matricula = Matricula;
        this.Nome = Nome;
        this.Curso = Curso;
    }

    public void setNome (String n){
        this.Nome = n;
    }
    public String getNome(){
        return this.Nome;
    }

    public void setMatricula(int m){
    this.Matricula = m;
    }
    public int getMatricula(){
        return this.Matricula;
    }
    public void setCurso (String c){
        this.Curso = c;
    }
    public String getCurso(){
        return this.Curso;
    }
    
    @Override
    public String toString() {
        return getNome() + " (" + getMatricula()  + ") " + " - " + getCurso();

    }
}

