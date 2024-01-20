import java.util.Scanner;

public class aula38_1 {
    public static void main(String[] args) {
        System.out.println("----- Aula 38.1 -----");
        // A38.1 - Aprendendo Funções
        // Fazer, sem função, um programa que receba diversas frutas do usuário e no final imprima em ordem contrária.
        // O programa deve solicitar ao usuario quantas frutas ele quer informar. 
        // No próximo arquivo, refazer com função.

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de frutas: ");
        int numFrutas = Integer.parseInt(sc.nextLine());
        String cesta_de_frutas[] = new String[numFrutas];

        String fruta;
        for (int i = 0 ; i < numFrutas; i++) {
            System.out.println("Informe a " + (i + 1) + "° fruta");
            fruta = sc.nextLine();
            cesta_de_frutas[i] = fruta;
        }

        for (int i = numFrutas-1; i >= 0; i--) {
            System.out.println("Fruta " + (i + 1) + " " + cesta_de_frutas[i]);
        }
    } // Programa feito sem funções, no arquivo seguinte, será feito com funções.
}
