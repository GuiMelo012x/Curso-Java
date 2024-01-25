package armazenamento_sequencial;

public class ArmazenamentoSequencial { // Aula 102
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Jodie");
        Aluno a2 = new Aluno("Justine");
        Aluno a3 = new Aluno("Sandra"); // fora da lista
        Aluno a4 = new Aluno("Colman");
        Aluno a5 = new Aluno("Bradley");


        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);
        System.out.println(lista.toString());
        System.out.println("Total de Alunos: " + lista.tamanho());
        System.out.println(lista.contem(a1)); // true
        System.out.println(lista.contem(a3)); // false
        try{
            System.out.println(lista.pega(0) + " " + lista.pega(101)) ; // pega o aluno na posição 0
        }catch (IllegalArgumentException e){
            System.out.println("O aluno desta posição não existe");
            System.out.println(e.getMessage());
        }

        lista.adiciona(1,a4); // Adicionou na posição 2, onde a Justine já ocupava.
        System.out.println(lista); // moveu Justine para a posição 3, e o Colman agora ocupa a posição 2.
        try{
           lista.adiciona(510,a5);
        }catch (IllegalArgumentException e){
           System.out.println(e.getMessage() + " - e.getMessage()");
        }
        lista.remove(0); // ao remover a Jodie, o Colman deve vir para a posição dela.
        System.out.println(lista);

        // Teste do método que cria outro array maior que o original e substitui pelo antigo
        for (int i = 0; i < 300; i++) {
            Aluno a = new Aluno("Maria " + i);
            lista.adiciona(a);
        }
        System.out.println(lista);
        System.out.println(lista.tamanho());

    }
}
