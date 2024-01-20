import java.util.Scanner;

public class aula38_2 {
    static Scanner sc = new Scanner(System.in);
    static String cesta_de_frutas[];

    public static void main(String[] args) {

        System.out.println("----- Aula 38.2 -----");
        // A38.2 - Criando nossas Funções
        // Fazer o mesmo programa anterior das frutas, porém com funções.

        System.out.println("Informe a quantidade de frutas: ");
        int numFrutas = Integer.parseInt(sc.nextLine());

        quantidade(numFrutas);
        imprimir(numFrutas);

    }
  
    static void quantidade (int qtdFrutas){
         cesta_de_frutas = new String[qtdFrutas];
        for (int i = 0 ; i < qtdFrutas; i++) {
            System.out.println("Informe a " + (i + 1) + "° fruta");
            cesta_de_frutas[i] = sc.nextLine();
        }
    }

    static void imprimir (int qtdFrutas){
        for (int i = (qtdFrutas-1); i >= 0; i--) {
            System.out.println("Fruta " + (i + 1) + " " + cesta_de_frutas[i]);
        }
    }
}

