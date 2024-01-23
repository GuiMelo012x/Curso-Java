package hash_map;

import object_javalang.Conta;

public class Cliente extends Conta {
    String nome;
    String endereço;


    public Cliente(String nome, String endereço){
        this.nome = nome;
        this.endereço = endereço;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.endereço;
    }
}
