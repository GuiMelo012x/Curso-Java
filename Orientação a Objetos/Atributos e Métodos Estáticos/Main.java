package atributos_e_metodos_estaticos;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("Cristiana");

        System.out.println(c1.getNumero()); // Será contador, que é 1
        System.out.println(c1.getCliente());

        System.out.println();

        Conta c2 = new Conta("Elias");
        System.out.println(c2.getNumero()); // Será contador + 1, que agora é 2.
        System.out.println(c2.getCliente());

        System.out.println();

        Conta c3 = new Conta("Edimo");
        System.out.println(c3.getNumero()); // Será contador + 1, que agora é 3.
        System.out.println(c3.getCliente());

        Conta.contador = 40; // Alterando o atributo

        System.out.println();

        Conta c4 = new Conta("Renata ");
        System.out.println(c4.getNumero());
        System.out.println(c4.getCliente());

        System.out.println("A próxima conta será: " + Conta.proximaConta()); // Método estático, não depende de uma instância.


    }
}
