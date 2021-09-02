package AULA10_atividade1;

public class Associado {
    private String numAssociado;
    private String nome;
    protected double valorMensal;
    private String atividade;


    Associado(String numero, String nome, double valor, String atividade){
        this.numAssociado = numero;
        this.nome = nome;
        this.valorMensal = valor;
        this.atividade = atividade;
    }

    public double custoMensal(){
        return this.valorMensal;
    }

    public double getValorMensal() {
        return valorMensal;
    }
}

