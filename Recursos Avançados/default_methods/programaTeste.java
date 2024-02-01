package default_methods;

import java.util.Map;

public class programaTeste {
    public static void main(String[] args) {
        Teste t = new ClasseTeste();

        System.out.println(t.mensagem());

        t.meu_metodo(); // testando o método default
    }
}
