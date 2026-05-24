package br.edu.ifpb.ads.padroes.atv1.domain.estrategias;

import br.edu.ifpb.ads.padroes.atv1.domain.Disco;

public interface InteresseStrategy {
    boolean verificarInteresse(Disco disco, String interesse);
    String formatarMensagem(Disco disco);
}
