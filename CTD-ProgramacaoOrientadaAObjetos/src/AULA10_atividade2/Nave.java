package AULA10_atividade2;

public class Nave extends Objeto{
    private double velocidade;
    private int vida;

    Nave(int posx, int posy, char direcao, double velocidade, int vida){
        super(posx, posy, direcao);
        this.velocidade = velocidade;
        this.vida = vida;
    }

    public void girar(char direcao){
        System.out.println("A nave girou na direção " + direcao);
    }

    public String restaVida(int valor){
        return "Ainda resta " + valor + " de vida";
    }

    @Override
    public String toString() {
        return "Nave{" +
                "velocidade=" + velocidade +
                ", vida=" + vida +
                '}';
    }
}
