package AULA20_PadraoState_CarrinhoCompras;

public class Fechado implements Estado{

    private Carrinho c;

    public Fechado(Carrinho c){
        this.c = c;
    }

    @Override
    public void adicionarProduto(Produto produto) {
        System.out.println("Você não pode mais adicionar produtos. Você já encerrou suas compras!");
    }

    @Override
    public void cancelarCarrinho() {
        System.out.println("Você não pode mais cancelar seu carrinho. Você já encerrou suas compras!");
    }

    @Override
    public void retornarAoPontoAnterior() {
        System.out.println("Você não pode mais retornar a uma etapa anterior. Você já encerrou suas compras!");
    }

    @Override
    public void irParaProximoEstado() {
        c.setEstado(new Vazio(c));
        c.esvaziarCarrinho();
    }

}
