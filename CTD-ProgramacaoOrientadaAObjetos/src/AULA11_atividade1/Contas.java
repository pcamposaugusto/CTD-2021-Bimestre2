package AULA11_atividade1;

public abstract class Contas {
    private double saldo;
    private Cliente cliente;

    public Contas(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public abstract void sacar(double valor);

    public void relatarSaldo() {
        System.out.println("Seu saldo atual é: R$ " + this.saldo);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
