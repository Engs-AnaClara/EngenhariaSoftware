class Livro {
    private String nome;
    private String autor;
    private int paginas; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty ()) {
            this.nome=nome;
        } else {
            System.out.println("Nome não pode estar vazio");
        } } }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        if (autor != null && !autor.isEmpty ()) {
            this.autor = autor;
        } else {
                System.out.println("Autor não pode estar vazio");
            }

   public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        if (paginas > 0) {  
            this.paginas = paginas;
        } else {
            System.out.println("Erro: Páginas deve ser maior que zero!");
        }
    }



}