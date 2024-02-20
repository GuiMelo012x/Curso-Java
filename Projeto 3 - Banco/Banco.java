package view;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

import helper.Utils;
import jdk.jshell.execution.Util;
import model.Cliente;
import model.Conta;

public class Banco {
    static String nome = "Banco Gui";
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Conta> contas;

    public static void main(String[] args) {
        Banco.contas = new ArrayList<Conta>();
        Banco.menu();
    }

    public static void menu(){
        int opcao = 0;
        System.out.println("ATM - Banco Gui - ");
        System.out.println("Selecione uma opção no menu: ");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Efetuar saque");
        System.out.println("3 - Efetuar depósito");
        System.out.println("4 - Efetuar transferência");
        System.out.println("5 - Listar contas");
        System.out.println("6 - Sair");
        try{
            opcao = Integer.parseInt(Banco.sc.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Por favor, informe uma opção válida.");
            Utils.pausar(1);
            Banco.menu();
        }

        switch (opcao){
            case 1:
                Banco.criarConta();
                break;
            case 2:
                Banco.efetuarSaque();
                break;
            case 3:
                Banco.efetuarDeposito();
                break;
            case 4:
                Banco.efetuarTransferência();
                break;
            case 5:
                Banco.listarContas();
                break;
            case 6:
                System.out.println("Obrigado por utilizar o nosso banco! Até a Próxima!");
                Utils.pausar(2);
                System.exit(0);
            default:
                System.out.println("Opção inválida.");
                Utils.pausar(2);
                Banco.menu();
                break;
        }
    }


    public static void criarConta(){
        System.out.println("Informe os dados do cliente: ");

        System.out.println("Nome do Cliente: ");
        String nome = Banco.sc.nextLine();

        System.out.println("Email do Cliente: ");
        String email = Banco.sc.nextLine();

        System.out.println("CPF do Cliente: ");
        String cpf = Banco.sc.nextLine();

        System.out.println("Data de Nascimento do Cliente: ");
        String data_nascimento = Banco.sc.nextLine();

        Cliente cliente = new Cliente(nome, email, cpf, Utils.stringParaData(data_nascimento));

        Conta conta = new Conta(cliente);

        Banco.contas.add(conta);

        System.out.println("Conta criada com sucesso!");
        System.out.println("Dados da conta criada: ");

        System.out.println(conta);
        System.out.println();

        Utils.pausar(2);
        Banco.menu();


    }

    public static void efetuarSaque(){
        System.out.println("Informe o número da conta: ");
        int numero = Banco.sc.nextInt();

        Conta conta = Banco.buscarContaPorNumero(numero);
        if(conta != null){
            System.out.println("Informe o valor para saque: ");
            Double valor = Banco.sc.nextDouble();

            conta.sacar(valor);
        }else{
            System.out.println("Não foi encontrada a conta número " + numero);
        }

        Utils.pausar(2);
        Banco.menu();
    }



    public static void efetuarDeposito(){
        System.out.println("Informe o número da conta: ");
        int numero = Banco.sc.nextInt();

        Conta conta = Banco.buscarContaPorNumero(numero);
        if(conta != null){
            System.out.println("Informe o valor de depósito: ");
            Double valor = Banco.sc.nextDouble();

            conta.depositar(valor);
        }else{
            System.out.println("Não foi encontrada a conta número " + numero);
        }

        Utils.pausar(2);
        Banco.menu();
    }

    public static void efetuarTransferência(){
        System.out.println("Informe o número da sua conta: ");
        int numero_Origem = Banco.sc.nextInt();
        Conta conta_Origem = Banco.buscarContaPorNumero(numero_Origem);
        if(conta_Origem != null){
            System.out.println("Informe o número da conta destino: ");
            int numero_Destino = Banco.sc.nextInt();
            Conta conta_Destino = Banco.buscarContaPorNumero(numero_Destino);

            if(conta_Destino != null){
                System.out.println("Informe o valor da transferência: ");
                Double valor = Banco.sc.nextDouble();
                conta_Origem.transferir(conta_Destino,valor);
            }else{
                System.out.println("A conta destino número " + numero_Destino + " não foi encontrada.");
            }

        }else {
            System.out.println("Não foi encontrada a conta " + numero_Origem);
        }

        Utils.pausar(2);
        Banco.menu();

    }

    public static void listarContas(){
        if(Banco.contas.size() > 0 ){
            System.out.println("Listagem de contas");
            System.out.println();

            for(Conta conta: Banco.contas){
                System.out.println(conta);
                System.out.println();
                Utils.pausar(1);
            }
        }else{
            System.out.println("Ainda não existem contas cadastradas.");
        }

        Utils.pausar(2);
        Banco.menu();

    }

    public static Conta buscarContaPorNumero(int numero){
        Conta c = null;
        if(Banco.contas.size() > 0){
            for (Conta conta : Banco.contas){
                if (conta.getNumero() == numero){
                    c = conta;
                }
            }
        }
        return c;
    }
}
