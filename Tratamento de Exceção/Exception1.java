import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        int numeros[] = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 3 * 2;
        }
        for (int i = 0; i <= numeros.length; i++) { // Vai dar erro de IndexOutOfBonds
            try { // Tentar:
                System.out.println(numeros[6]);
            } catch (ArrayIndexOutOfBoundsException e){ // Ver no console o erro, e colocar o que deu no console, daí, deve-se implementar o "try catch"
                System.out.println("Você está tentando acessar uma posição do array que não existe.");
            }// Caso não consiga:
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nInforme dois números para dividir: ");
        try{
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();// Ambas as linhas 22 e 23 podem gerar a exception InputMismatch, que é se digitar uma letra.

        System.out.println("A divisão é: " + (num1/num2)); // Esta linha pode gerar a exceção Arithmetic, que é a divisão por zero.

        }catch (ArithmeticException e){
            System.out.println("Não é possível dividir por zero.");

        }catch (InputMismatchException x){
            System.out.println("Número inválido, uma letra foi digitada.");
        }
        finally {
            System.out.println("Continua o processo");
        }
    }
}
