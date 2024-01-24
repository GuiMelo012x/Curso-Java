package semSincronia; // Aula 98

/**
 * Este programa é uma simulação de uma geração de relatórios + barra de tarefas
 * Sem a utilização de Threads.
 */

public class SemThreads {
    public static void main(String[] args) {
        BarraDeProgresso barra1 = new BarraDeProgresso();
        barra1.executa();

        Relatorio relatorio1 = new Relatorio();
        relatorio1.executa();
// O programa não está atuando de forma simultânea.
    }
}
