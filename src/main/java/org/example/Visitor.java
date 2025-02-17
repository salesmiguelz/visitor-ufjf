package org.example;

public interface Visitor {
    String exibirPushNotification(PushNotification pushNotification);
    String exibirSMSNotification(SMSNotification smsNotification);
    String exibirEmailNotification(EmailNotification emailNotification);
}
