package synchronizedThreads;

public class Cliente extends Conta {
    int idade;
    String nome;
    String endereço;


    public Cliente(String nome, String endereço, int idade){
        this.nome = nome;
        this.endereço = endereço;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.endereço;
    }
}
