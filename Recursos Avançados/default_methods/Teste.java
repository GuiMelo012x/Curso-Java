package default_methods;

public interface Teste {
    int valor = 9;
    public String mensagem();

    default void meu_metodo(){
        System.out.println("Mensagem do método default vindo da interface Teste");
    }
}
