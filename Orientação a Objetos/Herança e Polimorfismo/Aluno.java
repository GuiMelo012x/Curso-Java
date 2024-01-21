package herança_e_polimorfismo;

// Aluno é uma Pessoa.
// Quando uma classe herda de outra classe, ela ganha todos os atributos e métodos da classe herdada.
// É uma subclasse de pessoa, classe filha.
public class Aluno extends Pessoa {
    private String ra;

    public Aluno(String nome, int idade,String ra, String email) {
        super(nome,idade, email);  // Pessoa (nome,idade);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome(){
        return "Aluno: " + super.getNome() + " - Método getNome em Aluno";
    }

    @Override
    public String toString() {
        return super.toString() + " | R.A:" + this.ra + " - Método ToString (Aluno)";
    }
}
