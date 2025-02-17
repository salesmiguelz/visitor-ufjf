package org.example;

public class JSONVisitor implements Visitor{

    public String exibir(Notification notification){
        return notification.aceitar(this);
    }

    public String exibirPushNotification(PushNotification pushNotification) {
        return "{dispositivo: " + pushNotification.getDispositivo() +", mensagem: " + pushNotification.getMensagem() + "}" ;
    }

    public String exibirSMSNotification(SMSNotification smsNotification) {
        return "{numero: " + smsNotification.getNumeroTelefone() +", mensagem: " + smsNotification.getMensagem() + "}" ;
    }

    public String exibirEmailNotification(EmailNotification emailNotification) {
        return "{email: " + emailNotification.getEmail() +", mensagem: " + emailNotification.getMensagem() + "}" ;
    }
}
