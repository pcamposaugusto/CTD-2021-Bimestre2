package AULA20_PadraoState_Tamagochi;

public class Feliz implements Estado{

    private Tamagochi t;

    public Feliz(Tamagochi t) {
        this.t = t;
    }

    @Override
    public void come() {
        System.out.println("Come come");
    }

    @Override
    public void bebe() {
        System.out.println("Beep, beep, beep, beep, beep");
    }

    @Override
    public void carinho() {
        System.out.println("Cut cut");
    }
}
