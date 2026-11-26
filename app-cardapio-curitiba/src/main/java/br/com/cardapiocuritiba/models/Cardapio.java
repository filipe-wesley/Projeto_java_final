package br.com.cardapiocuritiba.models;

import java.util.List;

public class Cardapio {
    private String nomeComercio;
    private List<Produto> produtos;

    public Cardapio(String nomeComercio, List<Produto> produtos) {
        this.nomeComercio = nomeComercio;
        this.produtos = produtos;
    }

    public String getNomeComercio() {
        return nomeComercio;
    }

    public void setNomeComercio(String nomeComercio) {
        this.nomeComercio = nomeComercio;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }
}