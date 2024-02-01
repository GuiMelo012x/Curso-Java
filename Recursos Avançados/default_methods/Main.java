package default_methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        Comparator<String> comparador = new Comparador();

        palavras.add("Curso");
        palavras.add("Estágio");
        palavras.add("Java");
        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Python");
        palavras.add("Faculdade");

        Collections.sort(palavras, comparador); // Ordena pelo tamanho
        System.out.println(palavras);

//        for (int i = 0; i < palavras.size(); i++) {
//            System.out.println("A palavra " + palavras.get(i) + " tem tamanho " + palavras.get(i).length());
//        }

    }
}
