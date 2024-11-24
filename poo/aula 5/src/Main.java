//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setNumconta(1111);
        p1.setNomedono("Jubileu");
        p1.abrirconta("CC");


        Conta p2= new Conta();
        p2.setNumconta(2222);
        p2.setNomedono("Creusa");
        p2.abrirconta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);


        p2.estadoatual();
        p1.estadoatual();

    }
}