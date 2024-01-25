package filas;

import java.util.LinkedList;
import java.util.Queue;

public class FilaImplementadaPeloJava {
    public static void main(String[] args) {
        Queue <String> fila = new LinkedList<String>();
        // Add
        fila.add("Bruce");
        fila.add("Clark");
        fila.add("Diana");
        System.out.println(fila);

        // Remove
        String ret = fila.poll();
        System.out.println(ret + " - foi o primeiro a sair.");
        System.out.println(fila);

        // Peek
        System.out.println(fila.peek() + " - está em primeiro na fila.");

        // IsEmpty
        System.out.println(fila.isEmpty() + " - fila não está vazia.");
        fila.poll();
        fila.poll();
        System.out.println(fila.isEmpty() + " - fila vazia.");

    }
}
