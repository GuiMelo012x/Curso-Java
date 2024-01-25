package pilhas;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
    private List<String> nomes = new LinkedList<String>();


    public void insere(String nome){ // Insere apenas no topo.
        this.nomes.add(nome);
    }

    public String remove (){ // Remove apenas no topo.
        try {
            return nomes.remove(nomes.size() - 1);//  O size pode ser 5, mas o topo é o 4.
        }catch (IndexOutOfBoundsException e){
            System.out.println("A Pilha já está vazia.");
            return"";
        }

    }

    public boolean vazia(){
        return nomes.size() == 0;
    }

    @Override
    public String toString() {
        return this.nomes.toString();
    }

    public String verTopo(){
        return nomes.get(nomes.size()-1);
    }
}
