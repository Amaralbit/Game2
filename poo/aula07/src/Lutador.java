public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe,int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        this.categoria = categoria;
        if (this.getPeso()<52.2){
            this.categoria="Inválido";
        }else if (this.getPeso()<=70.3){
            this.categoria="Leve";
        }else if(this.getPeso()<=83.9){
            this.categoria="Médio";
        }else if (this.getPeso()<=120.2){
            this.categoria="Pesado";
        }else{
            this.categoria="Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("----------------------------------------------------------");
        System.out.println("Chegou a hora!!Apresentamos o Lutador: "+this.getNome());
        System.out.println("Nascido em: "+this.getNacionalidade());
        System.out.println("Ele tem "+this.getIdade()+" anos de idade");
        System.out.println("Com uma altura de: "+this.getAltura()+" m de altura");
        System.out.println("E pesando: "+this.getPeso()+" kg");
        System.out.println("Ele tem : "+this.getVitorias()+" vitorias");
        System.out.println("E: "+this.getDerrotas()+" derrotas");
        System.out.println("E: "+this.getEmpates()+" empates");


    }
    public void status(){
        System.out.println(this.getNome()+" é um peso "+this.getCategoria());
        System.out.println("Vitórias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("Empates: "+this.getEmpates());

    }
    public void ganharluta(){
        this.setVitorias(this.getVitorias()+1);

    }
    public void perderluta(){
        this.setDerrotas(this.getDerrotas()+1);

    }
    public void empatarluta(){
        this.setEmpates(this.getEmpates()+1);

    }
}
