package pilhas;

import java.util.Stack;

public class PilhaImplementadaDoJava {
    public static void main(String[] args) {
        Stack<String> nomes = new Stack<>();

        // Push
        nomes.push("Chazelle"); // Adiciona no topo
        nomes.push("Coppola");
        System.out.println(nomes);

        // Peek
        String ret = nomes.peek(); // Retorna o elemento que está no topo.
        System.out.println(nomes.peek() + " - está no topo (peek).");


        // Pop
        String r1 = nomes.pop(); // Remove do topo - remove o Coppola
        System.out.println(r1 + " foi excluído."); // R1 armazena quem foi excluído.
        System.out.println(nomes); // Lista após a exclusão

        // Empty
        System.out.println(nomes.empty() + " pilha não está vazia"); // Antes de excluir o último elemento.
        nomes.pop(); // Excluindo
        System.out.println(nomes.empty() + " - pilha está vazia"); // Após excluir o último elemento.


    }
}
