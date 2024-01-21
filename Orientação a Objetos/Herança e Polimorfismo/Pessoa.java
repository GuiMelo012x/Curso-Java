package herança_e_polimorfismo;
// Classe base, pois serve de base para outras classes (Aluno).
public class Pessoa {
    private String nome;
    private int idade;

    private String email;

    public Pessoa(String nome, int idade,String  email) {
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

    @Override
    public String toString() {
        return "nome = " + nome + ", idade = " + idade + ", email = " + email;
    }
}
