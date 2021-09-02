package AULA10_atividade2;

public class Asteroide extends Objeto {
    private int danos;

    Asteroide(int posx, int posy, char direcao, int danos){
        super(posx, posy, direcao);
        this.danos = danos;
    }

    @Override
    public String toString() {
        return "Asteroide{" +
                "danos=" + danos +
                '}';
    }
}
