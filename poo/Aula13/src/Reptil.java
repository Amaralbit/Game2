public class Reptil extends Animal{
    private String cordaescama;

    public String getCordaescama() {
        return cordaescama;
    }

    public void setCordaescama(String cordaescama) {
        this.cordaescama = cordaescama;
    }

    @Override
    public void locomover() {
        System.out.println("rastejando");

    }

    @Override
    public void alimentar() {
        System.out.println("comendo um inseto");

    }

    @Override
    public void emitirsom() {
        System.out.println("Som de réptil");

    }
}
