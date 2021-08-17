package POO_AULA5_Classes_e_Objetos;

//Para desenvolver um jogo, precisamos implementar a classe UsuarioJogo. Os usuários possuem nome e um nickname, e estes dados devem ser fornecidos ao criar um novo usuário. Inicialmente, a pontuação é zero. Porém, eles podem aumentar esse nível em 1.

//Assim, devemos fornecer um método para realizar esse aumento. O usuário também pode receber um bônus, ou seja, um valor extra que é acrescentado em sua pontuação.

//Com base no diagrama de classe, implemente o código da classe UsuarioJogo para provar que o diagrama criado é válido. Crie dois objetos da classe UsuarioJogo com pontuações e níveis diferentes.



public class UsuarioJogo {
    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    UsuarioJogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
        this.pontuacao = 0;
        this.nivel = 0;
    }

    public String getNickname() {
        return nickname;
    }

    public String aumentarPontuacao() {
        this.pontuacao += 1;
        String mensagem = this.pontuacao + " ponto(s).";
        return mensagem;
    }

    public String subirNivel() {
        this.nivel += 1;
        return "Você subiu 1 nível";
    }

    public String bonus(int valor) {
        this.pontuacao += valor;
        return "Surpresa! Você ganhou um bônus de " + valor + " pontos!!!";
    }

}
