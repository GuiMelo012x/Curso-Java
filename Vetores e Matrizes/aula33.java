public class aula33 {
    public static void main(String[] args) {
        System.out.println("----- Aula 33 -----");
        // A33 - Vetores
        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] += i;
        }

        numeros[9] = numeros[9] * 20; // se o [9] é o 9, então 9 * 20 = 180
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        // Os vetores possuem o tamanho de [n-1], ou seja, o [10] tem 9 indexes.

        System.out.println("---------------------");

        for (int i:numeros) {
            System.out.println(i);
        }
    }
}
