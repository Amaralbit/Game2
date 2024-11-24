public class Ave extends Animal{
    private String cordepena;

    public String getCordepena() {
        return cordepena;
    }

    public void setCordepena(String cordepena) {
        this.cordepena = cordepena;
    }

    public void fazerninho(){
        System.out.println("Fazendo ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");

    }

    @Override
    public void alimentar() {
        System.out.println("Comendo sementes");

    }

    @Override
    public void emitirsom() {
        System.out.println("Piando");

    }
}
