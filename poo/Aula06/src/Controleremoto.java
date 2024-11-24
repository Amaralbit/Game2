public class Controleremoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public Controleremoto(){
        this.volume=50;
        this.ligado=false;
        this.tocando=false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirmenu() {
        System.out.println("---------MENU---------");
        System.out.println("Está ligado? "+this.isLigado());
        System.out.println("Está tocando? "+this.isTocando());
        System.out.print("Volume: "+this.getVolume());
        for (int i=0; i<=this.getVolume();i+=10){
            System.out.print("|");
        }
        System.out.println("");

    }

    @Override
    public void fecharmenu() {
        System.out.println("Fechando o menu...");

    }

    @Override
    public void maisvolume() {
        if (this.isLigado()==true){
            this.setVolume(this.getVolume()+5);
        }else{
            System.out.println("Impossivel aumentar o volume!");
        }

    }

    @Override
    public void menosvolume() {
        if (this.isLigado()==true){
            this.setVolume(this.getVolume()-5);
        }else{
            System.out.println("Impossivel diminuir volume!");
        }

    }

    @Override
    public void ligarmudo() {
        if (this.isLigado() && this.getVolume()>0){
            this.setVolume(0);
        }

    }

    @Override
    public void desligarmudo() {
        if (this.isLigado() && this.getVolume()==0){
            this.setVolume(50);
        }

    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Comando não pode ser possivel no momento!");
        }

    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }else{
            System.out.println("Comando não pode ser possivel no momento!");
        }

    }
}
