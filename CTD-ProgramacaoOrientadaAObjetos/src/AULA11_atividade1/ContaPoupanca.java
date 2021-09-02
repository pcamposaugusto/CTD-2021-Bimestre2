package AULA11_atividade1;

public class ContaPoupanca extends Contas {
    private double taxaJuros;

    public ContaPoupanca(double saldo, Cliente cliente, double taxeJuros) {
        super(saldo, cliente);
        this.taxaJuros = taxeJuros;
    }

    @Override
    public void sacar(double valor){
        if((getSaldo() - valor) <= 0) {
            System.out.println("Você não possui saldo suficiente.");
        } else {
            setSaldo(getSaldo() - valor);
            System.out.println("Você sacou R$ " + valor);
        }
    }

    public void cobrarJuros(){
        double rendimento = getSaldo() * this.taxaJuros;
        System.out.println("O rendimento de sua poupança foi de: R$ " + rendimento);
    }


}
