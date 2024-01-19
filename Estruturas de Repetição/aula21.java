import  java.util.Scanner;
public class aula21 {
    public static void main(String[] args) {
        System.out.println("----- Aula 21.1 -----");
        // A21 - While
        // Fazer um programa que receba os dados do usuário enquanto a idade for maior que 0.

        int idade = 1;
        String nome;
        Scanner sc = new Scanner(System.in);
        while (idade > 0){
            System.out.println("Informe seu nome: ");
            nome = sc.nextLine(); // Recebe uma String

            System.out.println("Informe sua idade: ");
            // idade = sc.nextInt();  = BUG
            idade = Integer.parseInt(sc.nextLine()); // Resolver o bug. transforma o int em String.

            System.out.println(nome + " tem " + idade + " anos.");
        }




        System.out.println("----- Aula 21.2 -----");
        // A21.2 - Do While

        do{ // Primeiro executa o bloco, depois ele faz a checagem.
            System.out.println("Informe seu nome: ");
            nome = sc.nextLine(); // Recebe uma String

            System.out.println("Informe sua idade: ");
            idade = Integer.parseInt(sc.nextLine());

            System.out.println(nome + " tem " + idade + " anos.");

        } while (idade >0);
    }
}
