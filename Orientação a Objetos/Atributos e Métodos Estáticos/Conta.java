package atributos_e_metodos_estaticos;

public class Conta {

    private int numero;
    private String cliente;
    public static int contador = 1;
    //		O c1,c2 e c3 são uma instância da classe Conta, e compartilham o número pelo atributo "contador"
    public Conta(String cliente) {
        this.numero = contador;
        this.cliente = cliente;
        Conta.contador = Conta.contador + 1; //  +1 pois irá incrementar
        //Para usar a forma estática, deve ser utilizado o "Conta.contador" ao invés de "this.contador"
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public static int proximaConta(){ // Método Estático
        return Conta.contador;
    }
}
