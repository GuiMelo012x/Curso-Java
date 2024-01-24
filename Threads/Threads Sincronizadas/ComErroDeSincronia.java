package synchronizedThreads;

public class ComErroDeSincronia {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("J Robert","Los Alamos",40);
        Conta c1 = new Conta(1,500f,300f,cli1);

        System.out.println(c1);
        FazDeposito acao = new FazDeposito(c1);
        Thread t1 = new Thread(acao);
        Thread t2 = new Thread(acao);

        t1.start();
        t2.start();
    }
}
