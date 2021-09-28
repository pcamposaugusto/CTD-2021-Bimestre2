package AULA20_PadraoState_CarrinhoCompras;

public class Carregando implements Estado {

    private Carrinho c;

    public Carregando(Carrinho c){
        this.c = c;
    }

    @Override
    public void adicionarProduto(Produto produto) {
        c.getListaProduto().add(produto);
        for(int i = 0; i < c.getListaProduto().size(); i++){
            System.out.println(c.getListaProduto().get(i));
        }
    }

    @Override
    public void cancelarCarrinho() {
        c.setEstado(new Vazio(c));
    }

    @Override
    public void retornarAoPontoAnterior() {
        c.setEstado(new Vazio(c));
    }

    @Override
    public void irParaProximoEstado() {
        c.setEstado(new Pagando(c));
    }

}
