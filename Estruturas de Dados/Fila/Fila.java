package filas;

import java.util.LinkedList;
import java.util.List;

public class Fila { // Aula 106
    private List<String> nomes = new LinkedList<String>();


    public void adiciona(String nome){
        this.nomes.add(nome);
    }

    public String remove(){
        try{
            return nomes.remove(0); // Pois remove o primeiro elemento.
        }catch (IndexOutOfBoundsException e){
            System.out.println("A fila já está vazia.");
            return "";
        }
    }

    public boolean vazia() {
        return this.nomes.size() == 0; // Se nomes.size for igual a 0, retorna true. Se não, false.
    }


    @Override
    public String toString() {
        return this.nomes.toString();
    }
}
