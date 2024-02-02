package view;

import model.Calcular;

import java.util.Scanner;

/**
 * Classe Game que vai conter os elementos que serão utilizados em volta de todo o projeto.
 */
public class Game {
    static Scanner sc = new Scanner(System.in);
    static int pontos = 0;
    static Calcular calc; // Pois faremos acesso a ele fora do Main, pois vamos fazer acesso fora dos métodos.


    public static void main(String[] args) {
        Game.jogar();
    }

    /**
     * Método que realiza todo o cerne do jogo.
     */
    public static void jogar(){
        System.out.println("Selecione a dificuldade: ");
        int dificuldade = Game.sc.nextInt();

        Game.calc = new Calcular(dificuldade);

        System.out.println("Informe o resultado para a seguinte operação: ");

        if(calc.getOperacao() == 0){ // Somar
            System.out.println(calc.getV1() + " + " + calc.getV2());
            int resposta = Game.sc.nextInt();

            if(calc.somar(resposta)){
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s)");
            }
        }

        else if(calc.getOperacao() == 1){ // Subtrair
            System.out.println(calc.getV1() + " - " + calc.getV2());
            int resposta = Game.sc.nextInt();

            if(calc.subtrair(resposta)){
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s).");
            }
        }

        else if(calc.getOperacao() == 2){ // Multiplicar
            System.out.println(calc.getV1() + " * " + calc.getV2());
            int resposta = Game.sc.nextInt();

            if(calc.multiplicar(resposta)){
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s).");
            }
        }
        else {
            System.out.println("A operação " + calc.getOperacao() + " não é reconhecida.");
        }

        System.out.println("Deseja continuar? (1 - Sim | 0 - Não)");
        int continuar = Game.sc.nextInt();
        if(continuar == 1){
            Game.jogar();
        }else {
            System.out.println("Pontuação final : " + Game.pontos + " pontos.");
            System.out.println("Até a próxima!");
            System.exit(0);
        }
    }
}
