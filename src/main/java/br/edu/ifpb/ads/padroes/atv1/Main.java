package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.domain.Disco;
import br.edu.ifpb.ads.padroes.atv1.domain.Interessado;
import br.edu.ifpb.ads.padroes.atv1.domain.TipoInteresse;
import br.edu.ifpb.ads.padroes.atv1.repository.RepositorioDiscos;
import br.edu.ifpb.ads.padroes.atv1.service.notificacao.impl.EmailNotificacao;
import br.edu.ifpb.ads.padroes.atv1.service.notificacao.impl.PushNotificacao;
import br.edu.ifpb.ads.padroes.atv1.service.notificacao.impl.SmsNotificacao;


public class Main {

    public static void main(String[] args) {

        RepositorioDiscos repositorio = new RepositorioDiscos();

        Interessado interessado1 = new Interessado(
                TipoInteresse.ARTISTA,
                "Metallica",
                new EmailNotificacao()
        );

        Interessado interessado2 = new Interessado(
                TipoInteresse.GENERO,
                "Rock",
                new SmsNotificacao()
        );

        Interessado interessado3 = new Interessado(
                TipoInteresse.TITULO,
                "All We Know Is Falling",
                new PushNotificacao()
        );

        repositorio.addInteressado(interessado1);
        repositorio.addInteressado(interessado2);
        repositorio.addInteressado(interessado3);

        Disco disco1 = new Disco(
                "Metallica",
                "Master of Puppets",
                "Heavy Metal - Rock",
                1986
        );

        Disco disco2 = new Disco(
                "Nirvana",
                "Nevermind",
                "Grunge",
                1991
        );

        Disco disco3 = new Disco(
                "Paramore",
                "All We Know Is Falling",
                "Alternative Rock",
                2005
        );

        repositorio.addDisco(disco1);
        repositorio.addDisco(disco2);
        repositorio.addDisco(disco3);
    }
}