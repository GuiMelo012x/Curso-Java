package executaveis_jar;

public class Conta {
    int numero;
    private float saldo;
    float limite;
    Cliente cliente;

    public Conta(int numero, float saldo, float limite, Cliente cliente){
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }
// Para colocar descrição no método.
    /**
     * Método para realizar depósito
     * @param valor a ser depositado
     */
    public void sacar(float valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente." + " Saldo: R$" + this.saldo);
        } else {
            this.saldo = this.saldo - valor;
            System.out.println("Após o saque, João ficou com: R$" + this.saldo);
        }
    }

    public void depositar(float valor){
        this.saldo = this.saldo + valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Método que retorna o saldo
     * @return
     */
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
