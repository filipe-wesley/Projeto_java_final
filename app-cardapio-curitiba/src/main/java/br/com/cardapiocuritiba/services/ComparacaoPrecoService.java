package br.com.cardapiocuritiba.services;

import br.com.cardapiocuritiba.models.Comercio;
import br.com.cardapiocuritiba.models.Produto;

import java.util.List;

public class ComparacaoPrecoService {

    public Produto encontrarMelhorPreco(List<Comercio> comercios, String nomeProduto) {
        Produto melhorProduto = null;
        double menorPreco = Double.MAX_VALUE;

        for (Comercio comercio : comercios) {
            for (Produto produto : comercio.getCardapio().getProdutos()) {
                if (produto.getNome().equalsIgnoreCase(nomeProduto) && produto.getPreco() < menorPreco) {
                    menorPreco = produto.getPreco();
                    melhorProduto = produto;
                }
            }
        }

        return melhorProduto;
    }
}