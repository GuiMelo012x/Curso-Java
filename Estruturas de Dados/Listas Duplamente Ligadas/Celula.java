package listas_duplamente_ligadas;

/**
 * Esta Classe irá representar uma célula (container)
 * onde teremos o objeto (valor) e uma célula, que será a ligação para o próximo.
 */
public class Celula {
    private Object elemento; // elemento q vai ficar dentro da lista.
    private Celula proximo; // faz a ligação da célula atual com a próxima célula.
    private Celula anterior;

    public Celula(Object elemento, Celula proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }
    public Celula(Object elemento){
        this(elemento,null);
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Celula getAnterior(){
        return this.anterior;
    }
    public void setAnterior(Celula anterior){
        this.anterior = anterior;
    }
}
