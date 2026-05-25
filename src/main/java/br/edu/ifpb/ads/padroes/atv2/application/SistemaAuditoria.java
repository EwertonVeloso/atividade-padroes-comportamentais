package br.edu.ifpb.ads.padroes.atv2.application;

import br.edu.ifpb.ads.padroes.atv2.domain.model.Item;
import br.edu.ifpb.ads.padroes.atv2.domain.model.impl.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.domain.model.impl.Servico;
import br.edu.ifpb.ads.padroes.atv2.domain.visitor.impl.ImprimirValores;
import br.edu.ifpb.ads.padroes.atv2.domain.visitor.impl.RelatorioImpostos;

import java.util.ArrayList;
import java.util.List;

public class SistemaAuditoria {
    public static void main(String[] args) {

        List<Item> itens = new ArrayList<>();
        itens.add(new ProdutoFisico("Notebook", 4000.00));
        itens.add(new ProdutoFisico("Cadeira de Escritório", 600.00));
        itens.add(new Servico("Manutenção de Servidor", 1500.00));
        itens.add(new Servico("Consultoria", 3000.00));

        RelatorioImpostos relatorioImpostos = new RelatorioImpostos();
        ImprimirValores imprimirValores = new ImprimirValores();

        System.out.println("Valores:");
        for (Item item : itens) {
            item.accept(imprimirValores);
        }

        System.out.println("\nImpostos:" );
        for (Item item : itens) {
            item.accept(relatorioImpostos);
        }

        relatorioImpostos.exibirImpostoTotal();

    }
}
