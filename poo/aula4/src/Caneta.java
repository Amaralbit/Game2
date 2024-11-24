public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    boolean tampado;
    public Caneta(String m,String c,float p){ //Construtor
        this.modelo=m;
        this.cor=c;
        this.ponta=p;
        this.tampar();



    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;

    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
        this.tampado=true;
    }
    public void destampar(){
        this.tampado=false;
    }
    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Ponta: "+ this.getPonta());
        System.out.println("Cor: "+ this.cor);
        System.out.println("Tmapado: "+this.tampado);
    }


}
