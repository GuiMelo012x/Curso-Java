public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();  // Construtor.
        // Declaração e Instanciação do Objeto ---> p1 -> instância do objeto
        p1.nome = "Notebook";
        p1.preco = 2300f;
        p1.desconto = 15f;

        Produto p0; // Declaração do Objeto
        p0 = new Produto();
        p0.nome = "Caneta Bic";
        p0.preco = 2.45f;


        System.out.println("----- Produtos -----");
        System.out.println(p1.nome + " - R$ " + p1.preco + " - " + p1.desconto + "% de desconto." );
        System.out.println(p0.nome + " - R$ " + p0.preco); //p0

        Pessoa pessoa1 = new Pessoa(); // Construtor sem parâmetros
        pessoa1.nome = "Jula";
        pessoa1.idade = 18;
        System.out.println(pessoa1.nome + " - " + pessoa1.idade + " anos.");

        Pessoa pessoa2 = new Pessoa("Frank","New York",1915,79); // Construtor com parâmetros.
        System.out.println(pessoa2.nome + " " + pessoa2.cidade + " " + pessoa2.ano_nascimento + " " + " " + pessoa2.idade + " - Print");

        pessoa1.imprimir_informacoes(); // Null e 0 pois a cidade e ano de nascimento não estão declarados.
        pessoa2.imprimir_informacoes();

    }
}
