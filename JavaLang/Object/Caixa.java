package object_javalang;

public class Caixa {
    private Object[] objetos;
    private int posicaoLivre;

    public Caixa() {
        objetos = new Object[100];
        posicaoLivre = 0;
    }

    public void adicionar(Object nova){
        this.objetos[this.posicaoLivre] = nova;
        this.posicaoLivre++;
    }

    public Object pegar(int posicao){
        return this.objetos[posicao];
    }
}
