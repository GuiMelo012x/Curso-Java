package hash_map; // Aula 93
import java.util.HashMap;
import java.util.Map;

public class aulaHashMap {
    public static void main(String[] args) {
        Map<String, Conta> contas = new HashMap<String,Conta>();
        Cliente cli1 = new Cliente("Tomás Ribeiro","College Avenue");
        Cliente cli2 = new Cliente("Leila Oliveira","Rua Porto Alegre 1783");

        Conta c1 = new Conta(1,300f,300f,cli1);
        Conta c2 = new Conta(2,500f,500f,cli2);

        contas.put("Pessoa Física",c1); // (chave,valor)
        contas.put("Pessoa Jurídica",c2);

        System.out.println(contas.get("Pessoa Física"));
        System.out.println(contas.get("Pessoa Jurídica"));


    }
}
