import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarluta(Lutador l1, Lutador l2){
        if ((l1.getCategoria()==l2.getCategoria()) && (l1!=l2)){
            aprovada = true;
            desafiado=l1;
            desafiante=l2;
        }else{
            aprovada=false;
            desafiado=null;
            desafiante=null;
        }

    }
    public void lutar(){
        if (this.aprovada ){
            System.out.println("###DESAFIADO###");
            this.desafiado.apresentar();
            System.out.println("###DESAFIANTE###");
            this.desafiante.apresentar();

            Random aleatorio= new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("=======RESULTADO========");
            switch (vencedor){
                case 0:
                    System.out.println("EMPATOU!");
                    desafiado.empatarluta();
                    desafiante.empatarluta();
                    break;

                case 1:
                    System.out.println("O desafiado "+ desafiado.getNome()+" ganhou a luta!");
                    desafiado.ganharluta();
                    desafiante.perderluta();
                    break;

                case 2:
                    System.out.println("O desafiante "+desafiante.getNome()+" ganhou a luta!");
                    desafiado.perderluta();
                    desafiante.ganharluta();
                    break;
            }
            System.out.println("=====================");


        }else{
            System.out.println("A luta não foi aprovada, logo ela não pode ocorrer!!");
        }

    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
