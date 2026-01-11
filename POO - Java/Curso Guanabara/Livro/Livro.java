public class Livro implements Publicacao{

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa Leitor;


    public String detalhes() {
        return "livro [titulo = " + titulo + ", autor = " + autor + ", totPaginas = " + totPaginas + ", pagAtual = " + pagAtual
                + ", aberto = " + aberto + ", Leitor = " + Leitor.getNome() + "]";
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa Leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.Leitor = Leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setLeitor(Pessoa leitor) {
        Leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public Pessoa getLeitor() {
        return Leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;

    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;

    }

    @Override
    public void avancarPag() {
        this.pagAtual = pagAtual + 1;
    }

    @Override
    public void voltarPag() {
        this.pagAtual = pagAtual - 1;
    }

    
}
