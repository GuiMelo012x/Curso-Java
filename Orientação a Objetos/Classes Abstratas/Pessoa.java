package classes_abstratas;
// Classe base, pois serve de base para outras classes (Aluno).
public abstract class Pessoa {
    private String nome;
    private int idade;

    private String email;

    public Pessoa(String nome, int idade, String  email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract void mensagens(String texto); //Declaração de um método abstrato

    @Override
    public String toString() {
        return "Nome: " + nome + " " +
                "| idade: " + idade + " " +
                "| email: " + email;
    }
}
