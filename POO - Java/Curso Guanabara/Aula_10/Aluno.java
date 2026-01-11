public class Aluno extends Pessoa {

    private String matricula;
    private String curso;


    public void CancelarMatricula(){
        System.out.println("Matrícula será cancelada");
        
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
    
}
