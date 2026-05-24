package br.edu.ifpb.ads.padroes.atv1.notification.impl;

import br.edu.ifpb.ads.padroes.atv1.notification.ServicoNotificacao;

public class SmsNotificacao implements ServicoNotificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS:  " + mensagem);
    }
}
