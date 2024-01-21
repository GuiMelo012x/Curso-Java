package classes_abstratas;

public class Main {
    public static void main(String[] args) {
     //   Pessoa p1 = new Pessoa("Gilson",23,"gilson.vasconcellos@geradornv.com.br");
        // Após mudar "Pessoa" para abstrata, eu não posso mais instanciar nem mexer no objeto.


    TreinamentoInicio inicio = new TreinamentoInicio();
    inicio.treinoDiario();

    System.out.println("----------------------");

    TreinamentoFinal fim = new TreinamentoFinal();
    fim.treinoDiario();

    }
}
