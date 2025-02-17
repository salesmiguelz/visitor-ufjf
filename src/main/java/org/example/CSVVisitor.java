package org.example;

public class CSVVisitor implements Visitor{
    public String exibir(Notification notification) {
        return notification.aceitar(this);
    }
    public String exibirSMSNotification(SMSNotification smsNotification){
        return "telefone,mensagem\n" +
                "\"SMS:" + smsNotification.getNumeroTelefone() + "\",\"" + smsNotification.getMensagem() + "\",\"";
    }

    public String exibirEmailNotification(EmailNotification emailNotification){
        return "email,mensagem\n" +
                "\"SMS:" + emailNotification.getEmail() + "\",\"" + emailNotification.getMensagem() + "\",\"";
    }

    public String exibirPushNotification(PushNotification pushNotification){
        return "dispositivo,mensagem\n" +
                "\"SMS:" + pushNotification.getDispositivo() + "\",\"" + pushNotification.getMensagem() + "\",\"";
    }
}
