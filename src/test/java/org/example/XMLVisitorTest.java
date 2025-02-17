package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class XMLVisitorTest {
    @Test
    public void deveExibirSMSNotificationXML() {
        SMSNotification sms = new SMSNotification(123456789, "Teste XML");
        XMLVisitor visitor = new XMLVisitor();
        assertEquals("<notificacao>\n    <numeroTelefone>123456789</numeroTelefone>\n    <mensagem>Teste XML</mensagem>\n</notificacao>", visitor.exibir(sms));
    }

    @Test
    public void deveExibirEmailNotificationXML() {
        EmailNotification email = new EmailNotification("teste@email.com", "Teste XML");
        XMLVisitor visitor = new XMLVisitor();
        assertEquals("<notificacao>\n    <email>teste@email.com</email>\n    <mensagem>Teste XML</mensagem>\n</notificacao>", visitor.exibir(email));
    }

    @Test
    public void deveExibirPushNotificationXML() {
        PushNotification push = new PushNotification("Dispositivo123", "Teste XML");
        XMLVisitor visitor = new XMLVisitor();
        assertEquals("<notificacao>\n    <dispositivo>Dispositivo123</telefone>\n    <mensagem>Teste XML</mensagem>\n</notificacao>", visitor.exibir(push));
    }
}