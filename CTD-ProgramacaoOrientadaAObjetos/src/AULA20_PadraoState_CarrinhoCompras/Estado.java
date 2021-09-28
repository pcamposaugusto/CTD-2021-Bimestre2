package AULA20_PadraoState_CarrinhoCompras;

public interface Estado {

    public void adicionarProduto(Produto produto);
    public void cancelarCarrinho();
    public void retornarAoPontoAnterior();
    public void irParaProximoEstado();

}
