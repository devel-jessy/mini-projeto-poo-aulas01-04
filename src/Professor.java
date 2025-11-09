
public class Professor extends Pessoa {

    private String disciplina;
    private double salario;

    public Professor() {
        super();
    }

    public Professor(String nome, int idade, String email) {
        super(nome, idade, email);
    }

    public Professor(String nome, int idade, String email, String disciplina, double salario) {
        super(nome, idade, email);
        setDisciplina(disciplina);
        setSalario(salario);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if (disciplina == null || disciplina.trim().isEmpty()) {
            throw new IllegalArgumentException("Disciplina não pode ser vazia.");
        }
        this.disciplina = disciplina.trim();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0.0) {
            throw new IllegalArgumentException("Salário não pode ser negativo.");
        }
        this.salario = salario;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("=== Professor ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Email: " + getEmail());
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Salário: R$ " + salario);
    }
}
