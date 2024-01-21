package sobrecarga_e_sobrescrita;
/*
Quando sobrescrevemos métodos da classe pai (super) em classes filhas.
		Quando sobrescrevemos métodos da classe Pessoa na classe Alunos, por exemplo.
		Fizemos isso no método toString em "Alunos"
  */

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.mensagem();
        p1.mensagem("Boa tardeeeee!");
    }
}
