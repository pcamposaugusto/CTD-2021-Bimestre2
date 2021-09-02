package AULA10_atividade1;

public class AssociadoHabilitado extends Associado{

    private double custoPiscina;
    private  boolean habilitado;

    AssociadoHabilitado(String numero, String nome, String atividade, double valor, double custoPiscina){
        super(numero, nome, valor, atividade);
        this.custoPiscina = custoPiscina;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public double custoMensal() {
        if (this.habilitado)
            return super.valorMensal + this.custoPiscina;
        else
            return super.valorMensal;
    }

//    3 formas de escrever essa função:

//    1) super.custoMensal();
//    2) super.getValorMensal() - colocando o get na classe Associado, com valorMensal public;
//    3) super.valorMensal - sem get e com valorMensal protected.

}

