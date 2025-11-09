
public class EscolaApp {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Maria Silva", 16, "maria.silva@escola.com", "A123", 8.5);
        Aluno aluno2 = new Aluno("João Souza", 17, "joao.souza@escola.com", "A456", 9.2);

        Professor professor1 = new Professor("Carlos Lima", 40, "carlos.lima@escola.com",
                "Matemática", 4500.00);
        Professor professor2 = new Professor("Ana Paula", 35, "ana.paula@escola.com",
                "Português", 4300.00);

        Pessoa[] pessoas = new Pessoa[4];
        pessoas[0] = aluno1;
        pessoas[1] = aluno2;
        pessoas[2] = professor1;
        pessoas[3] = professor2;

        System.out.println("=== Sistema Escolar ===\n");

        for (Pessoa p : pessoas) {
            p.exibirInformacoes();
            System.out.println();
        }
    }
}
