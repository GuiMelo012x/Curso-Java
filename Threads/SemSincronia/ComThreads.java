package semSincronia; // Aula 98

public class ComThreads {
    public static void main(String[] args) {
        BarraDeProgresso barra = new BarraDeProgresso();
        Thread t1 = new Thread(barra);
        t1.start();


        Relatorio relatorio = new Relatorio();
        Thread t2 = new Thread(relatorio);
        t2.start();
    }
}
