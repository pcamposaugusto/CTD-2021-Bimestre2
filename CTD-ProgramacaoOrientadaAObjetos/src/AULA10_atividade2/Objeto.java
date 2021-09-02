package AULA10_atividade2;

public class Objeto {
    private int posx;
    private int posy;
    private char direcao;

    Objeto(int posx, int posy, char direcao){
        this.posx = posx;
        this.posy = posy;
        this.direcao = direcao;
    }

    public void irA(int x, int y, char direcao){
        System.out.println("O objeto está em movimento");
    }

}
