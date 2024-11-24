
public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1121213);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("masculino");
        a1.pagarmensalidade();
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setMatricula(121312);
        b1.setBolsa(12.5f);
        b1.setSexo("masculino");
        b1.pagarmensalidade();


    }
}