package view;

import helper.Utils;
import model.Produto;

import java.util.*;

/**
 * Programa principal.
 */
public class Mercado {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Produto> produtos;

    private static Map<Produto, Integer> carrinho;



    public static void main(String[] args) {
        produtos = new ArrayList<Produto>();
        carrinho = new HashMap<Produto, Integer>();
        Mercado.menu();

    }

    private static void menu(){
        System.out.println("Bem vindo(a) ao Mercado!");
        System.out.println("Selecione uma opção abaixo: ");

        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Comprar produto");
        System.out.println("4 - Visualizar carrinho");
        System.out.println("5 - Sair");

        int opcao = 0;
        try{
            opcao = Integer.parseInt(Mercado.sc.nextLine());
        }catch (InputMismatchException e){
            Mercado.menu();
        }catch (NumberFormatException f){
            Mercado.menu();
        }

        switch (opcao){
            case 1:
                Mercado.cadastrarProduto();
                break;
            case 2:
                Mercado.listarProduto();
                break;
            case 3:
                Mercado.comprarProduto();
                break;
            case 4:
                Mercado.visualizarCarrinho();
                break;
            case 5:
                System.out.println("Volte sempre!");
                Utils.pausar(2);
                System.exit(0);
            default:
                System.out.println("Opção inválida.");
                Utils.pausar(2);
                Mercado.menu();
                break;
        }
    }

    private static void cadastrarProduto(){
        System.out.println("Cadastro de Produto");

        System.out.println("Informe o nome do produto: ");
        String nome = Mercado.sc.nextLine();

        System.out.println("Informe o preço do produto: ");
        Double preco = Mercado.sc.nextDouble();

        Produto produto = new Produto(nome, preco);

        Mercado.produtos.add(produto); //

        System.out.println("O produto " + produto.getNome() + " foi cadastrado com sucesso.");
        Utils.pausar(2);
        Mercado.menu();
    }

    private static void listarProduto(){
        if(Mercado.produtos.size() > 0){
            System.out.println("Listando produto...");
            System.out.println();

            for (Produto p : Mercado.produtos){
                System.out.println(p);
                System.out.println();
            }

            Utils.pausar(2);
            Mercado.menu();

        }else {
            System.out.println("Ainda não existem produtos cadastrados.");
            Utils.pausar(2);
            Mercado.menu();
        }
        Utils.pausar(2);
        Mercado.menu();
    }

    private static void comprarProduto(){
        if(Mercado.produtos.size() > 0){
            System.out.println("Informe o código do produto que deseja comprar: ");
            System.out.println();

            System.out.println("Produtos disponíveis: ");
            for(Produto p : Mercado.produtos){
                System.out.println(p);
                System.out.println("--------------------");
            }
            int codigo = Integer.parseInt(Mercado.sc.nextLine());
            boolean tem = false;

            for(Produto p : Mercado.produtos){
                if(p.getCodigo() == codigo){
                    int quant = 0;
                    try{
                        quant = Mercado.carrinho.get(p);
                        Mercado.carrinho.put(p, quant + 1); // se já tiver, vai atualizar a quantidade.
                    }catch (NullPointerException e){
                        Mercado.carrinho.put(p,1); // Primeiro produto no carrinho.
                    }
                    System.out.println("O produto " + p.getNome() + " foi adicionado ao carrinho.");
                    tem = true;
                }
                if(tem){
                    System.out.println("Deseja adicionar outros produtos ao carrinho?");
                    System.out.println("Informe 1 para SIM ou 0 para NÃO.");
                    int op = Integer.parseInt(Mercado.sc.nextLine());

                    if(op == 1){
                        Mercado.comprarProduto();
                    }else {
                        System.out.println("Por favor aguarde enquanto fechamos seu pedido...");
                        Utils.pausar(2);
                        Mercado.fecharPedido();
                    }
                }else{
                    System.out.println("Não foi encontrado o produto com o código " + codigo);
                }
            }

        }else {
            System.out.println("Ainda não existe produto cadastrado no mercado.");
            Utils.pausar(2);
            Mercado.menu();
        }


        Utils.pausar(2);
        Mercado.menu();
    }

    private static void visualizarCarrinho() {
        if (Mercado.carrinho.size() > 0) {
            System.out.println("Produtos no carrinho: ");

            for (Produto p: Mercado.carrinho.keySet()){
                System.out.println("Produto: " + p + "\nQuantidade: " + Mercado.carrinho.get(p));
            }

        }else{
            System.out.println("Ainda não existem produtos no carrinho.");
        }

        Utils.pausar(2);
        Mercado.menu();
    }

    private static void fecharPedido(){
        Double valorTotal = 0.0;
        System.out.println("Produtos do Carrinho: ");
        for (Produto p : Mercado.carrinho.keySet()){
            int quant = Mercado.carrinho.get(p);
            valorTotal += p.getPreco() * quant;
            System.out.println(p);
            System.out.println("Quantidade: " + quant);
            System.out.println("------------------------");
        }
        System.out.println("Valor da conta: " + Utils.doubleParaString(valorTotal));
        Mercado.carrinho.clear();

        System.out.println("Obrigado por comprar conosco!");
        Utils.pausar(5);
        Mercado.menu();
    }
}
