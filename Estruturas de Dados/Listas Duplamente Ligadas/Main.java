package listas_duplamente_ligadas;

public class Main { // Aula 104
    public static void main(String[] args) {
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();


        System.out.println(lista); // Lista vazia

        lista.adicionaNoComeco("Ethan");
        lista.adicionaNoComeco("Julie");
        lista.adiciona("Leonardo");
        lista.adicionaNoComeco("Brad");
        lista.adiciona(1,"Pacino");
        System.out.println(lista);


        lista.removeComeco(); // Remove o Brad.
        System.out.println(lista);

        lista.removeFim();
        System.out.println(lista); // Remove o Leonardo

        lista.remove(1); // Remove a Julie
        System.out.println(lista);

        System.out.println(lista.contem("Pacino"));
        System.out.println(lista.contem("Julie"));

    }
}
