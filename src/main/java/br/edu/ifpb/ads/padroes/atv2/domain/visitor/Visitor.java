package br.edu.ifpb.ads.padroes.atv2.domain.visitor;

import br.edu.ifpb.ads.padroes.atv2.domain.model.impl.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.domain.model.impl.Servico;

public interface Visitor {
    void visit(ProdutoFisico produtoFisico);
    void visit(Servico servico);
}
