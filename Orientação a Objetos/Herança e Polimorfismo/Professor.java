package herança_e_polimorfismo;

public class Professor extends Pessoa{ // Professor = classe filha. Pessoa = classe mãe.
    private String matricula;

    public Professor(String nome, int idade, String matricula, String email) {
        super(nome, idade, email);
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome(){
        return "Professor: " + super.getNome() + " - Método getNome em Professor";
    }

    @Override
    public String toString() {
        return super.toString() + " | Matrícula: " + this.matricula + " - Método ToString (Professor)";
    }
}
