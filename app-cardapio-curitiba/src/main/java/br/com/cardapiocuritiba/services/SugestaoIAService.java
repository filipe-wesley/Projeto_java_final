package br.com.cardapiocuritiba.services;

import java.util.List;
import java.util.Optional;
import br.com.cardapiocuritiba.models.Produto;
import br.com.cardapiocuritiba.models.Comercio;

public class SugestaoIAService {

    private List<Comercio> comercios;

    public SugestaoIAService(List<Comercio> comercios) {
        this.comercios = comercios;
    }

    public Optional<Produto> sugerirProduto(String preferencia, double precoMaximo) {
        return comercios.stream()
            .flatMap(comercio -> comercio.getCardapio().getProdutos().stream())
            .filter(produto -> produto.getNome().toLowerCase().contains(preferencia.toLowerCase()) 
                    && produto.getPreco() <= precoMaximo)
            .findFirst();
    }

    public List<Produto> sugerirProdutosProximos(double latitude, double longitude, String preferencia) {
        // Implementar lógica para encontrar comércios próximos com base na localização
        // e sugerir produtos com base na preferência do usuário.
        return List.of(); // Retornar lista vazia como placeholder
    }
}