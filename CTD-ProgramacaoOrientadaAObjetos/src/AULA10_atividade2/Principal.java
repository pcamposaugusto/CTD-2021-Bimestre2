package AULA10_atividade2;

public class Principal {
    public static void main(String[] args){
        Nave nave1 = new Nave(3, 4, 'S', 100, 100 );
        Asteroide ast1 = new Asteroide(3, 4, 'S', 99);

        System.out.println(nave1);
        System.out.println(ast1);

        System.out.println(nave1.restaVida(10));

    }

}
