package POO_AULA5_Classes_e_Objetos;

//Para resolver um problema, devemos criar uma classe cliente. Um cliente tem um número de cliente, o nome e uma dívida. Para registrar esse cliente, teremos que possuir seu número e seu nome. Um cliente pode aumentar sua dívida ou quitar.

public class Cliente {

    private int numeroCliente;
    private String nome;
    private double divida;

    Cliente(int numeroCliente, String nome) {
        this.numeroCliente = numeroCliente;
        this.nome = nome;
        this.divida = 0;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public double aumentarDivida(double valor) {
        this.divida += valor;
        return this.divida;
    }

    public String pagarDivida() {
        this.divida = 0;
        return "Sua dívida foi paga.";
    }
}
