package AULA20_PadraoState_CarrinhoCompras;

import java.util.ArrayList;

public class Pagando implements Estado{

    private Carrinho c;

    public Pagando(Carrinho c){
        this.c = c;
    }

    @Override
    public void adicionarProduto(Produto produto) {
        System.out.println("Você não pode mais adicionar produtos. Por favor, pague suas compras!");
    }

    @Override
    public void cancelarCarrinho() {
        c.esvaziarCarrinho();
        c.setEstado(new Vazio(c));
    }

    @Override
    public void retornarAoPontoAnterior() {
        c.setEstado(new Carregando(c));
    }

    @Override
    public void irParaProximoEstado() {
        c.setEstado(new Fechado(c));
    }
}
