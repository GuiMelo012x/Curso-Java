import  java.util.Scanner;
public class aula22 {
    public static void main(String[] args) {
        System.out.println("----- Aula 22.1 -----");
        // A22.1 - For
        int idade;
        String nome;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe seu nome: ");
            nome = sc.nextLine(); // Recebe uma String

            System.out.println("Informe sua idade: ");
            idade = Integer.parseInt(sc.nextLine());


            if (idade > 0){
                System.out.println(nome + " tem " + idade + " anos.");
            }
        }

        System.out.println("----- Aula 22.2 -----");
        // A22.2 - For Each
        String universidade = "Universidade";

        // para cada um dos caracteres da string, imprima a letra.
        for (char letra : universidade.toCharArray()) {
            System.out.println(letra);
        }
        sc.close();
    }
}
