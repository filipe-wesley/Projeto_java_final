package br.com.cardapiocuritiba.models;

import java.time.LocalDate;

public class Promocao {
    private String descricao;
    private double desconto;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Promocao(String descricao, double desconto, LocalDate dataInicio, LocalDate dataFim) {
        this.descricao = descricao;
        this.desconto = desconto;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public boolean isValida() {
        LocalDate hoje = LocalDate.now();
        return (hoje.isEqual(dataInicio) || hoje.isAfter(dataInicio)) && (hoje.isEqual(dataFim) || hoje.isBefore(dataFim));
    }
}