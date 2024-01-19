public class matrizes {
    public static void main(String[] args) {
        System.out.println("----- Aula 35 -----");
        // Aula 35 - Matrizes
        int numeros [][] = new int[3][3]; // Matriz 3x3, 3 linhas e 3 colunas.
        numeros[0][0] = 1; // linha 0, coluna 0 =  1
        numeros[0][1] = 3;
        numeros[0][2] = 5;
        numeros[1][0] = 7;
        numeros[1][1] = 9;
        numeros[1][2] = 11; // linha 1, coluna 2 = 11
        numeros[2][0] = 13;
        numeros[2][1] = 15;
        numeros[2][2] = 17;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) { //numeros[i].length pois ele vê a qtd de itens que tem na linha
                System.out.println("numeros[" + i + "]" + "[" + j + "] = " + numeros[i][j] );
            } // Imprimindo a matriz.
        }
    }
}
