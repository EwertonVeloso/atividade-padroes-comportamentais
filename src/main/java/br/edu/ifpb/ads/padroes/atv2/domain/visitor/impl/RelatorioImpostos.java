package br.edu.ifpb.ads.padroes.atv2.domain.visitor.impl;

import br.edu.ifpb.ads.padroes.atv2.domain.model.impl.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.domain.model.impl.Servico;
import br.edu.ifpb.ads.padroes.atv2.domain.visitor.Visitor;

public class RelatorioImpostos implements Visitor {

    private double totalImpostos = 0;
    @Override
    public void visit(ProdutoFisico produtoFisico) {
        double imposto = produtoFisico.getValor() * 0.10;
        totalImpostos += imposto;

        System.out.printf("Imposto do produto '%s': R$ %.2f%n", produtoFisico.getNome(), imposto);
    }

    @Override
    public void visit(Servico servico) {
        double imposto = servico.getValor() * 0.15;
        totalImpostos += imposto;

        System.out.printf("Imposto do serviço '%s': R$ %.2f%n", servico.getDescricao(), imposto);
    }

    public void exibirImpostoTotal(){
        System.out.printf("Total de impostos: R$ %.2f\n", totalImpostos);
    }
}
