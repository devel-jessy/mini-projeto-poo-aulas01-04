
public class Pessoa {

    private String nome;
    private int idade;
    private String email;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String email) {
        setNome(nome);
        setIdade(idade);
        setEmail(email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        this.nome = nome.trim();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            throw new IllegalArgumentException("Idade deve ser maior que zero.");
        }
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido.");
        }
        this.email = email.trim();
    }

    public void exibirInformacoes() {
        System.out.println("=== Pessoa ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
    }
}
