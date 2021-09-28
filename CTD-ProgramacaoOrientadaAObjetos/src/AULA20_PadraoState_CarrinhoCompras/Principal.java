package AULA20_PadraoState_CarrinhoCompras;

public class Principal {

    public static void main(String[] args) {

        Produto produto1 = new Produto("maça", 5.0);
        Produto produto2 = new Produto("macarrão", 8.0);
        Produto produto3 = new Produto("azeite de oliva", 18.0);
        Produto produto4 = new Produto("álcool", 12.0);

        Carrinho carrinho1 = new Carrinho();

        carrinho1.cancelarCarrinho();
        carrinho1.adicionarProduto(produto1);
        carrinho1.adicionarProduto(produto2);
        carrinho1.irParaProximoEstado();
        carrinho1.adicionarProduto(produto3);
        carrinho1.retornarAoPontoAnterior();
        carrinho1.adicionarProduto(produto3);
        carrinho1.irParaProximoEstado();
        carrinho1.irParaProximoEstado();
        carrinho1.cancelarCarrinho();

    }
}
