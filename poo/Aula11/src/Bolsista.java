public class Bolsista extends Aluno{
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    public void renovarbolsa(){
        System.out.println("Renovando bolsa do aluno "+this.getNome());
    }

    @Override
    public void pagarmensalidade() {
        System.out.println(this.getNome()+" é bolsista!Pagamento facilitado");
    }
}
