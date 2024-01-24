package semSincronia;

public class BarraDeProgresso implements Runnable {
    public void executa(){
        // 10 milhões
        for (int i = 0; i < 100; i++) {
            System.out.println(i +  " - Barra de Progresso... aguarde");
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println( i + " - Barra de Progresso... aguarde");
        }
    }
}
