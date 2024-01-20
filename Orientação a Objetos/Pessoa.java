public class Pessoa {
    String nome,cidade;
    int ano_nascimento;
    int idade;

    public Pessoa(String nome, String cidade, int ano_nascimento, int idade){
        this.nome = nome;
        this.cidade = cidade;
        this.ano_nascimento = ano_nascimento;
        this.idade = idade;
    }

    public Pessoa(){

    }

    void imprimir_informacoes (){
        System.out.println(this.nome + " " + this.cidade + " " + this.ano_nascimento + " " + " " + this.idade + " - Método em Pessoa");
    }
}
