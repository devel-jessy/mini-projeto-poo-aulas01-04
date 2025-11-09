
public class Aluno extends Pessoa {

    private String matricula;
    private double notaMedia;

    public Aluno() {
        super();
    }

    public Aluno(String nome, int idade, String email) {
        super(nome, idade, email);
    }

    public Aluno(String nome, int idade, String email, String matricula, double notaMedia) {
        super(nome, idade, email);
        setMatricula(matricula);
        setNotaMedia(notaMedia);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || matricula.trim().isEmpty()) {
            throw new IllegalArgumentException("Matrícula não pode ser vazia.");
        }
        this.matricula = matricula.trim();
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        if (notaMedia < 0.0 || notaMedia > 10.0) {
            throw new IllegalArgumentException("Nota média deve estar entre 0 e 10.");
        }
        this.notaMedia = notaMedia;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("=== Aluno ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Email: " + getEmail());
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota média: " + notaMedia);
    }
}
