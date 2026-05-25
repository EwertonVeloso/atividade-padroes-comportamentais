package br.edu.ifpb.ads.padroes.atv2.domain.model.impl;

import br.edu.ifpb.ads.padroes.atv2.domain.model.Item;
import br.edu.ifpb.ads.padroes.atv2.domain.visitor.Visitor;

public class Servico implements Item {

    private String descricao;
    private double valor;

    public Servico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
