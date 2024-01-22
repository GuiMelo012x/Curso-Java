package object_javalang;

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
    public Conta(){

    }


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

    @Override
    public String toString() {
        return "O saldo da conta é: " + this.saldo;
    }

    @Override
    public boolean equals(Object obj) {
    if (!(obj instanceof Conta)){
        return false;
    }
        Conta verificar = (Conta) obj; // cast
        return verificar.getSaldo() == this.getSaldo();
    }
}
