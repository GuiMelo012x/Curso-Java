package default_methods;

import java.util.Comparator;

/**
 * Método comparador de String que ordena as strings pelo tamanho ao invés de ordem alfabética.
 *
 * P1 - String 1 < String 2 = retorna -1
 * P2 - String 1 = String 2 = retorna 0
 * P3 - String 1 > String 2 = retorna 1*/

public class Comparador implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()){
            return -1; // P1
        }
        if (s1.length() > s2.length()){
            return 1; // P3
        }
        return 0; // P2
    }
}
