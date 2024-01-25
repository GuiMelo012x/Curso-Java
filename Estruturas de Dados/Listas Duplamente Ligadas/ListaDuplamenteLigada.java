package listas_duplamente_ligadas;
public class ListaDuplamenteLigada { // Aula 104
    private Celula primeira = null;
    private Celula ultima = null;
    private int total = 0; // contador

    public void adicionaNoComeco(Object elemento) { // adiciona o objeto no começo da lista.
        if(this.total == 0){
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova; // Se estiver vazia, eles são iguais.
        }else{
            Celula nova = new Celula(elemento, this.primeira); // Instancia a nova célula.
            this.primeira = nova;
        }
        this.total = this.total + 1;
    }

    public void adiciona(Object elemento) { // adiciona o objeto no fim da lista.
        if (this.total == 0) { // verifica se a lista está vazia.
            this.adicionaNoComeco(elemento); // se estiver vazia, ele adiciona este elemento no começo.
        } else { // Se já existe algum elemento na lista, ele adiciona.
            Celula nova = new Celula(elemento);
            this.ultima.setProximo(nova); // a ultima adicionada estará ligada à nova.
            nova.setAnterior(this.ultima); // <- objeto -> pois a duplamente encadeada liga a q vem antes e depois
            this.ultima = nova;
            this.total += 1;
        }
    }

    public void adiciona(int posicao, Object elemento) { // adiciona um elemento no meio da lista, de acordo com a posição.
        if (posicao == 0) { // Se a lista for vazia,a posição será 0, logo, adiciona no começo.
            this.adicionaNoComeco(elemento);
        } else if (posicao == this.total) {
            this.adiciona(elemento); // Se for o último, ele adiciona no final.
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);

            Celula proxima = anterior.getProximo();

            Celula nova = new Celula(elemento, anterior.getProximo());

            anterior.setProximo(nova); // adicionado na lista duplamente ligada
            nova.setAnterior(anterior); // adicionado na lista duplamente ligada
            proxima.setAnterior(nova); // adicionado na lista duplamente ligada
            this.total = this.total + 1;
        }
    }

    public Object pegar(int posicao) { // retorna o objeto que está na posição requerida.
        return this.pegaCelula(posicao).getElemento();
    }

    public void removeComeco(){
        if (this.total == 0){
            throw new IllegalArgumentException("Lista Vazia");
        }

        this.primeira = this.primeira.getProximo(); // Movimenta
        this.total = this.total - 1;
        if (this.total == 0){
            this.ultima = null;
        }
    }

    public void removeFim(){
        if (this.total == 1){
            this.removeComeco(); // se possui apenas um elemento, então utilize o método q remove do começo.
        }else{
            Celula penultima = this.ultima.getAnterior();
            penultima.setProximo(null);
            this.ultima = penultima;
            this.total = this.total - 1;
        }

    }

    public void remove(int posicao) { // remove o objeto na posição solicitada.
        if (posicao == 0){
            this.removeComeco(); // Se for o único elemento.
        }else if (posicao == this.total -1){
            this.removeFim();//Se for o último elemento.
        }else{
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula atual = anterior.getProximo();
            Celula proxima = atual.getProximo();

            anterior.setProximo(proxima);
            proxima.setAnterior(anterior);

            this.total = this.total -1;
        }

    }

    public int tamanho() { // retorna o tamanho
        return this.total;
    }

    public boolean contem(Object obj) { // diz se o elemento existe na lista ou não.
        Celula atual = this.primeira;
        while(atual != null){
            if(atual.getElemento().equals(obj)){
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    @Override
    public String toString() {
        if (total == 0) {
            return "Lista vazia";
        }
        Celula atual = primeira;
        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < total; i++) {
            builder.append(atual.getElemento());
            builder.append(",");
            atual = atual.getProximo();
        }
        builder.append("]");
        return builder.toString();
    }

    private boolean posicaoOcupada(int posicao) { // Verifica se a posição está ocupada.
        return posicao >= 0 && posicao < this.total;
    }

    private Celula pegaCelula(int posicao) {
        if (!posicaoOcupada(posicao)) { // Verifica se a posição informada está dentro das posições q temos.
            throw new IllegalArgumentException("Posição Inexistente.");
        }
        Celula atual = this.primeira; // Será a célula atual.
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }
}
