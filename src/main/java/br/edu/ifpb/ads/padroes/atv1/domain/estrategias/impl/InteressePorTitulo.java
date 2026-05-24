package br.edu.ifpb.ads.padroes.atv1.domain.estrategias.impl;

import br.edu.ifpb.ads.padroes.atv1.domain.Disco;
import br.edu.ifpb.ads.padroes.atv1.domain.estrategias.InteresseStrategy;

public class InteressePorTitulo implements InteresseStrategy {
    @Override
    public boolean verificarInteresse(Disco disco, String interesse) {
        return disco.getTitulo().toLowerCase().contains(interesse.toLowerCase());
    }

    @Override
    public String formatarMensagem(Disco disco) {
        return "Novo disco adicionado: " +  disco.getTitulo();
    }
}
