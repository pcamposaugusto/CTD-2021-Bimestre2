package AULA20_PadraoState_CarrinhoCompras;


import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Produto> listaProduto = new ArrayList<>();
    private Estado estado;

    public Carrinho() {
        setEstado(new Vazio(this));
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Produto> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(List<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }

    public void esvaziarCarrinho() {
        System.out.println(this.listaProduto);
        this.listaProduto.clear();
        System.out.println("O carrinho está vazio: " + this.listaProduto);
    }

    //Outro método possível: removeAll()
    //Diferença em relação ao null - o null ele inutiliza o array (apaga da memória) - ele vai ser criado novamente, apenas se for instanciado

    public void adicionarProduto(Produto produto){
        getEstado().adicionarProduto(produto);
    }

    public void cancelarCarrinho(){
        getEstado().cancelarCarrinho();
    }

    public void retornarAoPontoAnterior(){
        getEstado().retornarAoPontoAnterior();
    }

    public void irParaProximoEstado(){
        getEstado().irParaProximoEstado();
    }

}
