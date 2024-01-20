public class Produto {
    String nome;
    float preco;
    float desconto;

    void aumentar_preco(float valor){ // ele recebe um parâmetro (valor) e aumenta de acordo com o que foi recebido
        this.preco = this.preco + valor;
    } // Como é void, não retorna nada, apenas executa um comando, que seria alterar o valor do preço.
}
