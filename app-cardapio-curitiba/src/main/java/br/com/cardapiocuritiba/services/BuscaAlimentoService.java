package br.com.cardapiocuritiba.services;

import br.com.cardapiocuritiba.models.Comercio;
import br.com.cardapiocuritiba.models.Produto;
import br.com.cardapiocuritiba.repositories.CardapioRepository;

import java.util.List;
import java.util.stream.Collectors;

public class BuscaAlimentoService {

    private final CardapioRepository cardapioRepository;

    public BuscaAlimentoService(CardapioRepository cardapioRepository) {
        this.cardapioRepository = cardapioRepository;
    }

    public List<Produto> buscarAlimentosPorNome(String nome) {
        List<Comercio> comercios = cardapioRepository.obterComercios();
        return comercios.stream()
                .flatMap(comercio -> comercio.getCardapio().getProdutos().stream())
                .filter(produto -> produto.getNome().toLowerCase().contains(nome.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Produto> buscarAlimentosComDesconto() {
        List<Comercio> comercios = cardapioRepository.obterComercios();
        return comercios.stream()
                .flatMap(comercio -> comercio.getCardapio().getProdutos().stream())
                .filter(Produto::temPromocao)
                .collect(Collectors.toList());
    }
}