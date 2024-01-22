package trabalhando_com_Strings;

public class TrabalhandoStrings {
    public static void main(String[] args) {
        String mensagem = "Boa noite";

        System.out.println(mensagem);

        String novaMensagem = mensagem.replace("noite","tarde");
        // para alterar mesmo:

        mensagem = mensagem.replace("noite","tarde");

        System.out.println(mensagem);
        System.out.println(novaMensagem);

        System.out.println(mensagem.toLowerCase());
        System.out.println(mensagem.toUpperCase());

        System.out.println(mensagem.charAt(2));// b = 0/ o = 1/ a = 2/

        for (int i = 0; i < mensagem.length(); i++) {
            System.out.print(mensagem.charAt(i));
        }

        System.out.println();

        for (int i = mensagem.length() -1 ; i >= 0 ; i--) {
            System.out.print(mensagem.charAt(i));
        }
    }
}
