package POO_AULA5_Classes_e_Objetos;

public class Principal {
    public static void main(String[] args) {

        Cliente Yana = new Cliente(2, "Yana");
        System.out.println(Yana.getNome() + " sua dívida é de " +  Yana.getDivida());
        Yana.aumentarDivida(500);
        System.out.println(Yana.getNome() + " sua dívida é de " + Yana.getDivida());


// ----------------------------------

        UsuarioJogo Paula = new UsuarioJogo("Paula", "poca");
        UsuarioJogo Leonardo = new UsuarioJogo("Leonardo", "Leo");

        System.out.println(Paula.getNickname() + " você ganhou " + Paula.aumentarPontuacao());
        System.out.println(Paula.getNickname() + " você ganhou " + Paula.aumentarPontuacao());
        System.out.println(Paula.getNickname() + " você ganhou " + Paula.aumentarPontuacao());
        System.out.println(Paula.getNickname() + ": " + Paula.subirNivel());
        System.out.println(Paula.getNickname() + ": " + Paula.bonus(5));


        System.out.println(Leonardo.getNickname() + " você ganhou " + Leonardo.aumentarPontuacao());
        System.out.println(Leonardo.getNickname() + " você ganhou " + Leonardo.aumentarPontuacao());
        System.out.println(Leonardo.getNickname() + ": " + Leonardo.subirNivel());
        System.out.println(Leonardo.getNickname() + ": " + Leonardo.bonus(2));

    }
}

