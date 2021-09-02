package AULA6;

public class Cachorro {
    private boolean apto = false;
    private String raca;
    private int ano;
    private double peso;
    private boolean chip = false;
    private boolean ferido = false;
    private String primeiroNome;

    public Cachorro(String primeiroNome, String raca, int ano, double peso, boolean chip, boolean ferido){
        this.ano = ano;
        this.peso = peso;
        this.raca = raca;
        this.primeiroNome = primeiroNome;
        this.chip = chip;
        this.ferido = ferido;
    }

    public Cachorro(){}


    public boolean isApto() {
        return apto;
    }

    public String getRaca() {
        return raca;
    }

    public int getAno() {
        return ano;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isChip() {
        return chip;
    }

    public boolean isFerido() {
        return ferido;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public int saberIdade(int anoAtual){
        return anoAtual - this.ano;
    }

    public String validarChip(){
        if(chip)
            return "o chip está validado";
        else
            return "O animal não possui chip";
    }

    public String encaminharParaAdocao(){
        if(ferido == false && peso > 5)
            return "O cachorro está apto para adoção!";
        else
            return "O cachorro não está apto para adoção";
    }


}
