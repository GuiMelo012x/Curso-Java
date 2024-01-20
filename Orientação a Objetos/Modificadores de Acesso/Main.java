package encapsulamento;

public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente("João","Rua Aurora,40");
        Cliente maria = new Cliente("Maria", joao.endereço);

        Conta conta_joao = new Conta(1, 100.0f, 200.0f, joao);
        Conta conta_maria = new Conta(2,300.0f,500.0f,maria);

        System.out.println("Saldo do João: " + conta_joao.getSaldo()); // 100.
        System.out.println("Saldo da Maria: " + conta_maria.getSaldo()); // 300

        // conta_joao.saldo = 20; --> Inutilizável após colocar o encapsulamento "private" na Classe Conta

        conta_joao.sacar(3000);
        conta_joao.sacar(30);

    }
}
