package listas_ligadas;

public class Main { // Aula 103
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista); // Lista vazia

        lista.adicionaNoComeco("Ethan"); // Adicionando no começo
        System.out.println(lista);
        lista.adicionaNoComeco("Julie"); // Adicionando no começo, deve estar na frente do Ethan.
        System.out.println(lista);

        lista.adiciona("Leonardo"); // Adiciona no final, deve estar após o Ethan.
        System.out.println(lista);

        lista.adicionaNoComeco("Brad"); // Adiciona no começo.
        System.out.println(lista);

        lista.adiciona(1,"Pacino"); // Colocar na posição 1, isto é, no lugar da Julie.
        System.out.println(lista); // Julie foi para a posição 3, e o Quentin entrou na posição 2.

        Object ret = lista.pegar(1); // Posição 1 = Pacino
        System.out.println(ret); // imprime a posição 1, que é o Pacino

        System.out.println(lista.tamanho()); // 5

        lista.removeComeco(); // Remove o Brad.
        System.out.println(lista);
    }
}
