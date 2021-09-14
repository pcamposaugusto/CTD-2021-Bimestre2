package AULA14_ex1;

public class Jogador implements Comparable<Jogador> {

    private int numCamisa;
    private String nome;
    private boolean lesionado;
    private  boolean titular;

    public Jogador(int numCamisa, String nome, boolean lesionado, boolean titular) {
        this.numCamisa = numCamisa;
        this.nome = nome;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    @Override
    public int compareTo(Jogador jogador) { //O sort precisa saber o atributo que ele irá comparar (quais valores comparar) via compareTo
        if (this.numCamisa == jogador.getNumCamisa())
            return 0;
        else if (this.numCamisa > jogador.getNumCamisa())
            return 1;
        else
            return -1;

    }

    public boolean isTitular() {
        return titular;
    }

    public String getNome() {
        return nome;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public boolean isLesionado() {
        return lesionado;
    }
}
