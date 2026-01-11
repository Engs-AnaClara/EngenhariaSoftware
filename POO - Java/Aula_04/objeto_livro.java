package Aula_04;

class Livro{
    private String titulo;
    private String autor;
    private int ano; 

    public Livro(){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String gettitulo(){
        return this.titulo;
    }

    public void settitulo( String titulo){
        this.titulo = titulo;
    }

    public String getautor(){
        return this.autor;
    }

    public void setautor (String autor){
        this.autor = autor;
    }

    public int getano(){
        return this.ano;
    }

    public void setano( int ano){
        if ( ano >= 0){
        this.ano = ano;}
    }
}