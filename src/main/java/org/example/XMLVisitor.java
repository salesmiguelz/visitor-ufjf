package org.example;

public class XMLVisitor implements Visitor{

    public String exibir(Notification notification) {
        return notification.aceitar(this);
    }


    public String exibirPushNotification(PushNotification pushNotification) {
      return "<notificacao>\n" +
                "    <dispositivo>" + pushNotification.getDispositivo() + "</telefone>\n" +
                "    <mensagem>" + pushNotification.getMensagem() + "</mensagem>\n" +
                "</notificacao>";
    }

    public String exibirSMSNotification(SMSNotification smsNotification) {
        return "<notificacao>\n" +
                "    <numeroTelefone>" + smsNotification.getNumeroTelefone() + "</numeroTelefone>\n" +
                "    <mensagem>" + smsNotification.getMensagem() + "</mensagem>\n" +
                "</notificacao>";
    }

    public String exibirEmailNotification(EmailNotification emailNotification) {
        return "<notificacao>\n" +
                "    <email>" + emailNotification.getEmail() + "</email>\n" +
                "    <mensagem>" + emailNotification.getMensagem() + "</mensagem>\n" +
                "</notificacao>";
    }
}
