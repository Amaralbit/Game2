public class Mamifero extends Animal{
    private String cordopelo;

    public String getCordopelo() {
        return cordopelo;
    }

    public void setCordopelo(String cordopelo) {
        this.cordopelo = cordopelo;
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");

    }

    @Override
    public void alimentar() {
        System.out.println("mamando");

    }

    @Override
    public void emitirsom() {
        System.out.println("som de mamífero");

    }
}
