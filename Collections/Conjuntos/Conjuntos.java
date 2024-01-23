package conjuntos; // Aula 92

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<String>();

        nomes.add("Leonardo");
        nomes.add("Margot");
        nomes.add("Cillian");
        nomes.add("Lily");
        nomes.add("Lily"); // Não aceita repetição

        System.out.println(nomes.contains("Margot"));
        System.out.println(nomes.contains("America"));

        for (String nome: nomes){
            System.out.println(nome);
        }


    }
}
