package AULA13_exercicioContas;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar (double valor){
        if(valor > getSaldo()) {
            System.out.println("Saldo insuficiente");
        } else {
            setSaldo(Math.round((getSaldo() - valor)*100.0)/100.0);
            System.out.println("Você sacou valor de: R$ " + valor);
        }
    }

    public void cobrarJuros(){
        double rendimento = Math.round((this.getSaldo() * 0.05)*100.0)/100.0;
            System.out.println("O rendimento projetado da sua conta é de: R$ " + rendimento);
    }

}
