package br.edu.ifpb.ads.padroes.atv2.domain.visitor.impl;

import br.edu.ifpb.ads.padroes.atv2.domain.model.impl.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.domain.model.impl.Servico;
import br.edu.ifpb.ads.padroes.atv2.domain.visitor.Visitor;

public class ImprimirValores implements Visitor {
    @Override
    public void visit(ProdutoFisico produtoFisico) {
        System.out.printf("Produto Físico: %s | Valor: R$ %.2f%n", produtoFisico.getNome(), produtoFisico.getValor());
    }

    @Override
    public void visit(Servico servico) {
        System.out.printf("Serviço: %s | Valor: R$ %.2f%n", servico.getDescricao(), servico.getValor());
    }
}
