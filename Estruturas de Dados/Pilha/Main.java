package pilhas;

public class Main { // Aula 105
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        // Método Insere (push)
        pilha.insere("Linklater");
        pilha.insere("Tarantino");
        pilha.insere("Nolan"); // - Nolan está no topo
        System.out.println(pilha);

        // Método Pegar Topo (peek)
        System.out.println(pilha.verTopo() + " - Topo da pilha");


        // Método Remove (pop)
        pilha.remove(); // remove o Nolan.
        System.out.println(pilha);

        // Método Pilha Vazia (retorna se está vazia ou não)
        System.out.println(pilha.vazia() + " - Antes da remoção");
        pilha.remove(); // remove o Linklater e o Tarantino,deixando a pilha vazia.
        pilha.remove();
        System.out.println(pilha.vazia() + " - Após a remoção (agora vazia)");

        // Removendo após a fila estar vazia.
        pilha.remove();

    }
}
