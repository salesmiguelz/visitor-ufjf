package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JSONVisitorTest {
    @Test
    public void deveExibirSMSNotificationJSON() {
        SMSNotification sms = new SMSNotification(123456789, "Teste JSON");
        JSONVisitor visitor = new JSONVisitor();
        assertEquals("{numero: 123456789, mensagem: Teste JSON}", visitor.exibir(sms));
    }

    @Test
    public void deveExibirEmailNotificationJSON() {
        EmailNotification email = new EmailNotification("teste@email.com", "Teste JSON");
        JSONVisitor visitor = new JSONVisitor();
        assertEquals("{email: teste@email.com, mensagem: Teste JSON}", visitor.exibir(email));
    }

    @Test
    public void deveExibirPushNotificationJSON() {
        PushNotification push = new PushNotification("Dispositivo123", "Teste JSON");
        JSONVisitor visitor = new JSONVisitor();
        assertEquals("{dispositivo: Dispositivo123, mensagem: Teste JSON}", visitor.exibir(push));
    }
}