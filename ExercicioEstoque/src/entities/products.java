package entities;

public class products {

    public String produtoNome;

    public int produtoQtde;

    public double produtoPreco;

    public double estoqueTotal() {
        return produtoPreco * produtoQtde;
    }

    public void estoqueAdd (int quantidadeAdd) {
        produtoQtde += quantidadeAdd;
    }

    public void estoqueRemove (int quantidadeRemove) {
        produtoQtde -= quantidadeRemove;
    }
}
