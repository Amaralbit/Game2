public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void receberaumento(float a){
        this.setSalario(this.getSalario()+ a);
        System.out.println("Agora com o aumento o seu salario é de R$"+this.getSalario());

    }


}
