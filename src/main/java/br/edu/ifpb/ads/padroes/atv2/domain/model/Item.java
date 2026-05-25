package br.edu.ifpb.ads.padroes.atv2.domain.model;

import br.edu.ifpb.ads.padroes.atv2.domain.visitor.Visitor;

public interface Item {
    double getValor();
    void accept(Visitor visitor);
}
