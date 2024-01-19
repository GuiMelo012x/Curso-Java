import java.util.Scanner;
public class estruturas_de_decisao {
    public static void main(String[] args) {
        System.out.println("----- Aula 16 -----");
        Scanner sc = new Scanner(System.in);
        // A16 - If, else, if else
        // Verificar se um número é maior que cinco
        int scanner_usuario = sc.nextInt();
        if (scanner_usuario > 5) {
            System.out.println(scanner_usuario + " " + "é maior que 5");
        } else if (scanner_usuario == 5) {
            System.out.println("É 5");
        } else {
            System.out.println(scanner_usuario + " " + "é menor que 5");
        }


        System.out.println("----- Aula 17 -----");
        // A17 - Operador Ternário
        int valor = -3, num;
       /* if (valor > 0) {
            num = valor;
        } else {
            num = 7;
        }
        Com operador ternário, dá pra fazer isso tudo em uma linha: */
        num = (valor > 0) ? valor : 7; // Se o valor for menor que zero, ele vira 7. Se for maior que zero, continua o mesmo.
        // O "?" seria o else.
        System.out.println(num);


        System.out.println("----- Aula 18 -----");
        // A18 - Switch
        int num1 = 5;
        switch (scanner_usuario) {
            case 1:
                System.out.println("O número é 1");
                break;
            case 2:
                System.out.println("O número é 2");
                break;
            case 5:
                System.out.println("O número é 5");
                break;
            default:
                System.out.println("O número não é nem 1,2 ou 5, o número é " + scanner_usuario);
                break;
            // Serve para tratar situações em que o usuario digita algo que não está nos casos acima.
            // Sem default, ele não faz nada.
        }
    }
}
