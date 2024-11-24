public class Peixe extends Animal{
    private String corescama;

    public String getCorescama() {
        return corescama;
    }

    public void setCorescama(String corescama) {
        this.corescama = corescama;
    }

    public void soltarbolha() {
        System.out.println("Soltando bolhas");

    }

    @Override
    public void locomover() {
        System.out.println("Nadando");

    }

    @Override
    public void alimentar() {
        System.out.println("comendo substancias da agua");

    }

    @Override
    public void emitirsom() {
        System.out.println("emitindo sons de peixe");

    }
}
