package br.edu.ifpb.ads.padroes.atv1.domain;

import br.edu.ifpb.ads.padroes.atv1.notification.ServicoNotificacao;

public class Interessado {

    private TipoInteresse tipoInteresse;
    private String interesse;
    private ServicoNotificacao servicoNotificacao;

    public Interessado(TipoInteresse tipoInteresse, String interesse, ServicoNotificacao servicoNotificacao) {
        this.tipoInteresse = tipoInteresse;
        this.interesse = interesse;
        this.servicoNotificacao = servicoNotificacao;
    }

    public boolean possuiInteresse(Disco disco) {

        return switch (tipoInteresse) {

            case TITULO ->
                    disco.getTitulo().toLowerCase()
                            .contains(interesse.toLowerCase());

            case ARTISTA ->
                    disco.getArtista().toLowerCase()
                            .contains(interesse.toLowerCase());

            case GENERO ->
                    disco.getGenero().toLowerCase()
                            .contains(interesse.toLowerCase());
        };
    }

    public void notificar(Disco disco) {
        servicoNotificacao.enviar(
                "Novo disco encontrado: " + disco.getTitulo()
        );
    }
}
