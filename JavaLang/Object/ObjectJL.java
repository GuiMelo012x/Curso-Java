package object_javalang;

public class ObjectJL {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Hilton","Rua Sebastião de Freitas");
        Cliente cliente2 = new Cliente("Silvio ","Avenida Brasil");

        Conta c1 = new Conta(194703241,200.0f,300f,cliente1);
        Conta c2 = new Conta(285962711,200.0f,300f,cliente1);

        Caixa prateleira = new Caixa();

        System.out.println(c1);
        System.out.println(c2);


        if(c1.equals(c2)){
            System.out.println("São a mesma conta");
        }else
            System.out.println("São contas diferentes.");


    }
}
