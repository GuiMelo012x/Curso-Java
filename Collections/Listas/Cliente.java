package listas;


public class Cliente implements Comparable {
    private int idade;
    String nome;
    String endereço;


    public Cliente(String nome, String endereço,int idade){
        this.idade = idade;
        this.nome = nome;
        this.endereço = endereço;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.endereço;
    }

    public int compareTo(Cliente outro) {
        Cliente aux = (Cliente)outro;
        if(this.idade < aux.idade) {
            return -1;
        }
        else if(this.idade > aux.idade){
            return 1;
        }else
            return 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
