package AULA20_PadraoState_CarrinhoCompras;

import java.security.ProtectionDomain;

public class Vazio implements Estado{

    private Carrinho c;

    public Vazio(Carrinho c){
        this.c = c;
    }

    @Override
    public void adicionarProduto(Produto produto) {
        c.getListaProduto().add(produto);
        for(int i = 0; i < c.getListaProduto().size(); i++){
            System.out.println(c.getListaProduto().get(i));
        }
        c.setEstado(new Carregando(c));
    }

    @Override
    public void cancelarCarrinho() {
        System.out.println("O carrinho está vazio.");
    }

    @Override
    public void retornarAoPontoAnterior() {
        System.out.println("O carrinho está vazio.");
    }

    @Override
    public void irParaProximoEstado() {
        System.out.println("O carrinho está vazio.");
    }
}
