package AULA11_atividade1;

import java.time.LocalDate;

public class ContaCorrente extends Contas{
    private double valorAutorizadoSaque;

    public ContaCorrente(double saldo, Cliente cliente, double valorAutorizadoSaque) {
        super(saldo, cliente);
        this.valorAutorizadoSaque = valorAutorizadoSaque;
    }

    @Override
    public void sacar(double valor) {
        if(this.valorAutorizadoSaque == 0 && getSaldo() == 0)
            System.out.println("Você não tem saldo suficiente e já atingiu o limite do cheque especial.");
        else if(getSaldo()==0 && this.valorAutorizadoSaque>valor) {
            this.valorAutorizadoSaque -= valor;
            System.out.println("Você está sem saldo. O valor foi debitado do limite do cheque de especial. Sobraram: R$ " + this.valorAutorizadoSaque);
        } else {
            setSaldo(getSaldo() - valor);
            System.out.println("Você possui saldo suficiente para o saque. O valor foi debitado da conta corrente. O seu saldo atual é: R$ " + getSaldo());
        }

    }

    public void depositarCheque(double valor, String bancoEmissor, LocalDate dataPagamento){
        setSaldo(getSaldo() + valor);
        System.out.println("Você depositou um cheque no valor de R$ " + valor + ", do " + bancoEmissor + ", na data " + dataPagamento);
    }
}
