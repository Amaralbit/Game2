public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totalpag;
    private int pagatual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalpag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.pagatual=0;
        this.aberto=false;
        this.totalpag = totalpag;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalpag() {
        return totalpag;
    }

    public void setTotalpag(int totalpag) {
        this.totalpag = totalpag;
    }

    public int getPagatual() {
        return pagatual;
    }

    public void setPagatual(int pagatual) {
        this.pagatual = pagatual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                "\n, autor='" + autor + '\'' +
                "\n, totalpag=" + totalpag +
                "\n, pagatual=" + pagatual +
                "\n, aberto=" + aberto +
                "\n, leitor=" + leitor.getNome() +
                "\n, idade=" + leitor.getIdade() +
                "\n, sexo=" + leitor.getSexo() +
                '}';
    }

    @Override
    public void abrir() {
        this.aberto=true;
    }

    @Override
    public void fechar() {
        this.aberto=false;

    }

    @Override
    public void folhear(int p) {
        if(p>this.totalpag){
            this.pagatual=0;

        }else{
            this.pagatual=p;
        }

    }

    @Override
    public void avancarpag() {
        this.pagatual++;

    }

    @Override
    public void voltarpag() {
        this.pagatual--;

    }
}
