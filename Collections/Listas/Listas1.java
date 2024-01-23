package listas; // Aula 91

import java.util.ArrayList;
import java.util.Collections;

public class Listas1 {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList<>();
        ArrayList <String> nomes = new ArrayList<>();
        ArrayList <Integer> numeros = new ArrayList<Integer>();

        lista.add("José"); // String
        lista.add(50); // Int
        lista.add(true); // Boolean
        lista.add(12.4); // Double
        lista.add(4f); // Float

        nomes.add("Bianca");
        nomes.add("Arno");
        nomes.add("Clorinde");

        System.out.println(lista.contains("José"));

        System.out.println(lista.get(0)+"\n"); // Pegar o item especificado na posição.

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Item na posição " + i + " - " + lista.get(i) + " - " + lista.get(i).getClass().getSimpleName());
        }

        System.out.println("--------------------");
        for (Object itens:lista){
            System.out.println(itens);
        }

        System.out.println("------- Desordenado (Padrão) -------");
        for (String nome:nomes){
            System.out.println(nome); // fora de ordem
        }

        System.out.println("------- Ordenado -------");
        Collections.sort(nomes);
        for(String nome: nomes){
            System.out.println(nome);
        }

        System.out.println("--------------------------");

        numeros.add(5);
        numeros.add(10);
        numeros.add(3);
        numeros.add(12);
        numeros.add(1);

        Collections.sort(numeros); // Organizou em ordem crescente
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }


    }
}
