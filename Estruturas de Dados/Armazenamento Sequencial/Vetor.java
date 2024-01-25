package armazenamento_sequencial;

import java.util.Arrays;

public class Vetor {
    private Aluno alunos[] = new Aluno[100];
    private int total = 0;

    public void adiciona(Aluno aluno){
        this.garantirEspaco();
        this.alunos[total] = aluno; // se o primeiro elemento é 0, ele incrementa no 0.
        total = total + 1; // e logo após, soma +1 e sobe de volta como 1.
    }

    public void adiciona(int posicao, Aluno aluno){
        this.garantirEspaco();
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        for (int i = total -1; i >= posicao; i --) {
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
        total++;// total = total + 1
    }

    public Aluno pega(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição Inválida"); // - pode ser usada com o comando e.getMessage()
        }
     return this.alunos[posicao];
    }

    public void remove(int posicao){ // O elemento seguinte do que está na posicao a ser removida irá voltar 1 casa para ocupar o que foi removido.
        for (int i = posicao; i < this.total; i++) {
            this.alunos[i] = this.alunos[i+1];
        }
        total--;
    }

    public boolean contem(Aluno aluno){
        for (int i = 0; i < total; i++) {
            if(aluno.equals(alunos[i])){ // ele verifica se o aluno que está chegando é igual aos alunos que estão dentro do array.
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return this.total; // retorna o "total" que está sendo incrementado no método "adiciona".
    }

    @Override
    public String toString() {
        return Arrays.toString(this.alunos); // Ajuda na visualização do array.
    }

    private boolean posicaoOcupada (int posicao){
        return posicao >=0 && posicao < total;
    }

    private void garantirEspaco(){
        if (total== alunos.length){ // verifica se o array de alunos está cheio.
            Aluno novoArray[] = new Aluno[alunos.length*2]; // Se estiver cheio, cria um array com os 100 alunos de antes + 100 espaços vazios.
            for (int i = 0; i < alunos.length; i++) {
                novoArray[i] = alunos[i]; // preenche os antigos 100 alunos.
            }
            this.alunos = novoArray; // substitui o array antigo de 100 para o novo array de 200.
        }
    }
}
