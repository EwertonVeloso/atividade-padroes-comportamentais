package br.edu.ifpb.ads.padroes.atv1.domain.estrategias.impl;

import br.edu.ifpb.ads.padroes.atv1.domain.Disco;
import br.edu.ifpb.ads.padroes.atv1.domain.estrategias.InteresseStrategy;

public class InteressePorGenero implements InteresseStrategy {
    @Override
    public boolean verificarInteresse(Disco disco, String interesse) {
        return disco.getGenero().toLowerCase().contains(interesse.toLowerCase());    }

    @Override
    public String formatarMensagem(Disco disco) {
        return "Novo disco do gênero: " + disco.getGenero();    }
}
