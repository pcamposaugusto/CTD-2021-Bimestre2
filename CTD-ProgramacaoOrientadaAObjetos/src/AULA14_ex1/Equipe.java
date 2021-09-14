package AULA14_ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipe {

    private String nome;
    private List<Jogador> listaJogadores = new ArrayList();

    public Equipe(String nome){
        this.nome = nome;
    }

    public void addJogador(Jogador jogador){
        listaJogadores.add(jogador);
    }

    public void mostrarJogadoresTitulares() {
        Collections.sort(listaJogadores);

        for (Jogador jogador: listaJogadores) {
            if (jogador.isTitular()) // Quando o tipo de dado é boolean, o default fica "is" e não "get"
                System.out.println("Nome: " + jogador.getNome() + ". Número da Camisa: " + jogador.getNumCamisa());
        }
    }

    public int getQuantidadeJogadoresLesionados(){
        int numLesionado = 0;
        for(Jogador jogador: listaJogadores){
            if (jogador.isLesionado() && jogador.isTitular())
                numLesionado++;
        }
        return numLesionado;
    }


}
