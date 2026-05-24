package br.edu.ifpb.ads.padroes.atv1.domain;

import br.edu.ifpb.ads.padroes.atv1.domain.estrategias.InteresseStrategy;
import br.edu.ifpb.ads.padroes.atv1.service.notificacao.ServicoNotificacao;

public class Interessado {

    private InteresseStrategy estrategia;
    private String interesse;
    private ServicoNotificacao servicoNotificacao;

    public Interessado(InteresseStrategy estrategia, String interesse, ServicoNotificacao servicoNotificacao) {
        this.estrategia = estrategia;
        this.interesse = interesse;
        this.servicoNotificacao = servicoNotificacao;
    }

    public boolean possuiInteresse(Disco disco) {
        return estrategia.verificarInteresse(disco, interesse);
    }

    public void notificar(Disco disco) {
        String mensagem = estrategia.formatarMensagem(disco);
        servicoNotificacao.enviar(mensagem);
    }
}
