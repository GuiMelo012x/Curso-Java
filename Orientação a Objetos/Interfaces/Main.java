package Interface;

public class Main {
    public static void main(String[] args) {
        Ventilador v1 = new Ventilador();
        System.out.println("A marca do ventilador é: " + v1.MARCA); // MARCA saiu da interface IEletrônico
        v1.ligar();
        v1.desligar();

    }
}
