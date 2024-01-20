public class aula39 {
    public static void main(String[] args) {
        System.out.println("----- Aula 39 -----");
        // A39 - Funções
        int valor1 = 100, valor2 = 74, res;
        System.out.println("O resultado é " + soma(valor1,valor2));
        System.out.println("O resultado é " + subtracao(valor1,valor2));
        System.out.println("O resultado é " + multiplicação(valor1,valor2));
        System.out.println(mensagem());

    }
    static int soma (int v1, int v2){
        return v1 + v2;
    }

    static int subtracao (int v1,int v2){
        return v1-v2;
    }

    static int multiplicação (int v1,int v2){
        return v1*v2;
    }

    static String mensagem(){
        return "Método Mensagem";
    }
}
