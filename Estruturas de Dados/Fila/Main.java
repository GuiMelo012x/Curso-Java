package filas;

public class Main { // Aula 106
    public static void main(String[] args) {
        Fila fila = new Fila();
        System.out.println(fila);

        // Método Adiciona
        fila.adiciona("Bale");
        fila.adiciona("Keaton");
        fila.adiciona("Cavill");
        System.out.println(fila);

        // Método Remove
        String ret = fila.remove(); // Remove o primeiro da fila (Bale) e armazena o excluído na variável "ret".
        System.out.println(fila + " - Após a exclusão do " + ret); // Printa quem foi excluído.

        // Método para checar se está vazio
        System.out.println(fila.vazia());
        fila.remove();
        fila.remove();
        System.out.println(fila.vazia() + " - após a remoção.");
        fila.remove(); // Removendo de uma fila já vazia.

    }
}
