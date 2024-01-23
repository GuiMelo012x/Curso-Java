package listas; // Aula 91

import java.util.ArrayList;
import java.util.Collections;

public class Listas2 {
    public static void main(String[] args) {
        ArrayList <Cliente> clientes = new ArrayList<Cliente>(); // Só adiciona objetos do tipo cliente

        Cliente c1 = new Cliente("Alex Rios","Rua Tenente Júlio",36);
        Cliente c2 = new Cliente("Esther Rogers","Hummingbird Way",25);
        Cliente c3 = new Cliente("Giovana Cardoso","Avenida Contorno",19);


        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);


        Collections.sort(clientes);
        // Como ele não sabe se deve ser ordenado por Nome ou Número,
        // deve ser implementado a classe "Comparable" na classe Cliente.

        for (Cliente clienteInfo: clientes){
            System.out.println(clienteInfo);
        }




    }
}
