package aulaMap; // Aula 94

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class aulaMap {
    public static void main(String[] args) {
        Map<Integer, String> pessoas = new HashMap<Integer,String>();

        pessoas.put(21,"De Niro");
        pessoas.put(41,"Martin Scorsese");
        pessoas.put(31,"Lily Gladstone");

        pessoas.keySet().forEach(idade -> {
            System.out.println(pessoas.get(idade));
        });

        System.out.println();
        System.out.println(pessoas.keySet() + " - Coleção de Chaves");
        System.out.println(pessoas.values()+ " - Coleção de Values");
        System.out.println(pessoas.entrySet() + " - Coleção de Associações");


        // Iterar na coleção de chaves, por exemplo. Pode fazer com nome também
        Set<Integer> chaves = pessoas.keySet();
        System.out.println("-----");
        for (Integer idade: chaves){
            System.out.println(idade);
        }

        // Iterar na coleção de valores
        Collection<String> valores = pessoas.values();
        System.out.println("-----");
        for (String nome: valores){
            System.out.println(nome);
        }
        System.out.println("-----");
        // Forma 2:
        pessoas.values().forEach(nome ->{
            System.out.println(nome);
        });

        // Iterar a coleção de associações
        Set<Map.Entry<Integer,String>> associacoes = pessoas.entrySet();
        System.out.println("-----");
        for (Map.Entry<Integer,String> associacao: associacoes){
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }

        // Forma 2:
        System.out.println("--Forma2--");
        pessoas.entrySet().forEach(associacao ->
                System.out.println(associacao.getKey() + " - " + associacao.getValue()));

    }
}
