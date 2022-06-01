package modelo;

public class Conta {

    public Conta(Titular titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Conta() {
    }

    private Titular titular;
    private int agencia;
    private long numero;
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (temSaldo(valor)) {
            saldo -= valor;
        }
    }

    private boolean temSaldo(double valor){
        if(saldo >= valor){
            return true;
        }
        System.out.println("Saldo insuficiente");
        return false;
    }

    public void transferir(double valor, Conta contaDestino){
        if (temSaldo(valor)){
            sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    @Override
    public String toString() {
        return String.format("Titular: %s; Agência: %d; Saldo: %.2f; Número: %d", titular, agencia, saldo, numero);
    }

    public double retornarSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public Titular getTitular() {
        return titular;
    }
}
