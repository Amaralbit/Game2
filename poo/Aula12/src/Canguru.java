public class Canguru extends Mamifero{

    public void usarbolsa(){
        System.out.println("O canguru está usando a sua bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
}
