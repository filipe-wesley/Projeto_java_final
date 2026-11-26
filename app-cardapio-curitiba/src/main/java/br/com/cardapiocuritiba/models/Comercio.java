package br.com.cardapiocuritiba.models;

import java.util.List;

public class Comercio {
    private String nome;
    private String localizacao;
    private List<Cardapio> cardapios;

    public Comercio(String nome, String localizacao, List<Cardapio> cardapios) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.cardapios = cardapios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public List<Cardapio> getCardapios() {
        return cardapios;
    }

    public void setCardapios(List<Cardapio> cardapios) {
        this.cardapios = cardapios;
    }
}