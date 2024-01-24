package semSincronia;

public class Relatorio implements Runnable{
    public void executa(){
        // 10 milhões
        for (int i = 0; i < 100; i++) {
            System.out.println(i +  " - Gerando Relatório... aguarde");
        }
    }
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " - Gerando Relatório... aguarde");
        }
    }
}

