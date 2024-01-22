package executaveis_jar;

import java.util.Scanner;

public class Principal {
        static Cliente cliente = new Cliente ("Júlio ", "Rua Afonso Carvalho");
        static Conta conta = new Conta(412141,30.0f,300.0f,cliente);
       static Scanner sc = new Scanner(System.in);

       public static void depositar(){
           System.out.println("Depósito: ");
           System.out.println("Informe o valor para depositar: ");
           float valor = sc.nextFloat();
           if(valor > 0 ){
               conta.depositar(valor);
               System.out.println("Depósito de " + valor + " efetuado com sucesso");
           }else
               System.out.println("O valor deve ser positivo.");
       }

       public static void sacar(){
           System.out.println("Saque: ");
           System.out.println("Informe o valor do saque: ");
           float valor = sc.nextFloat();
           if(valor > 0){
               conta.sacar(valor);
           }else
               System.out.println("O valor deve ser positivo.");
       }

       public static void consultar(){
           System.out.println("Seu saldo é " + conta.getSaldo());
       }

    public static void main(String[] args) {
           int opcao = 0;
        System.out.println("Bem vindo ao Banco Geek");
        do{
            System.out.println("Selecione uma opção abaixo: ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    depositar();
                    break;
                case 2:
                    sacar();
                    break;
                case 3:
                    consultar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }while(opcao > 0);

    }
}
