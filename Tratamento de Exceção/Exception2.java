import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números para dividir: ");
        try{
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();


            System.out.println("O resultado da divisão é: " + divisao(n1,n2));
            // Ela não deixa executar sem o tratamento de exceção, pois há a possibilidade de haver alguma. Ex: Divisão por 0.
        }
        catch (ArithmeticException e){
            System.out.println("Não foi possível dividir os valores.");
        }
        catch (Exception e) { // Se a exceção for do tipo Arithmetic, ele nem entra neste
            System.out.println("Não foi possível dividir.");

        }
        sc.close();
    }

    // Criando uma função que pode lançar uma exceção do tipo Exception
    public static int divisao (int n1, int n2) throws Exception{
        return n1/n2;
    }
}
