package AULA13_exercicioContas;

public class ContaCorrente extends Conta implements GravarImposto{

    private double valorPermitido;

    public ContaCorrente(double saldo, double valorPermitido) {
        super(saldo);
        this.valorPermitido = valorPermitido;
    }

    @Override
    public void sacar (double quantia){
        if(quantia > (getSaldo() + this.valorPermitido)) {
            System.out.println("Limite insuficiente");
        } else {
            setSaldo(Math.round((getSaldo() - quantia)*100.0)/100.0);
            System.out.println("Você sacou valor de: R$ " + quantia);
        }
    }

    @Override
    public double imposto(double porc){
        this.setSaldo(this.getSaldo() - (this.getSaldo() * porc/100));
        return this.getSaldo();
    }

}
