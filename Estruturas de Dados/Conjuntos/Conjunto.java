package conjuntos;

import java.util.LinkedList;
import java.util.List;

public class Conjunto {
    private LinkedList<LinkedList<String>> tabela = new LinkedList<LinkedList<String>>();

    public Conjunto(){
        for (int i = 0; i < 26; i++) {
            tabela.add(new LinkedList<String>()); // 26 Listas, cada uma pra uma letra do alfabeto.
        }
    }
    private int calculaIndice(String nome){
     return nome.toLowerCase().charAt(0) % 26;
    }

    public void adiciona(String nome){
        if(!contem(nome)){
            int indice = calculaIndice(nome); // Calcula o índice do nome
            List<String> lista = tabela.get(indice); // Pega a lista de acordo com o indice
            lista.add(nome); // Adiciona o nome na lista correta
        }
    }

    private boolean contem(String nome){
        int indice = calculaIndice(nome);
        return tabela.get(indice).contains(nome);
    }

    @Override
    public String toString() {
        return tabela.toString();
    }
}
