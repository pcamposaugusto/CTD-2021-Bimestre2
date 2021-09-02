package AULA11_atividade1;

public class Cliente {
    private int numeroCliente;
    private String nome;
    private String rg;
    private String cpf;
    private String conta;

    public Cliente(int numeroCliente, String nome, String rg, String cpf, String conta) {
        this.numeroCliente = numeroCliente;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.conta = conta;
    }
}
