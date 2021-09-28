package AULA20_PadraoState_CarrinhoCompras;

public class Produto {

    private String descricao;
    private Double preco;

    public Produto(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", preco='" + preco + '\'' +
                '}';
    }
}
