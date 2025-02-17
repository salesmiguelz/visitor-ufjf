package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CSVVisitorTest {
    @Test
    public void deveExibirSMSNotificationCSV() {
        SMSNotification sms = new SMSNotification(123456789, "Teste CSV");
        CSVVisitor visitor = new CSVVisitor();
        assertEquals("telefone,mensagem\n\"SMS:123456789\",\"Teste CSV\",\"", visitor.exibir(sms));
    }

    @Test
    public void deveExibirEmailNotificationCSV() {
        EmailNotification email = new EmailNotification("teste@email.com", "Teste CSV");
        CSVVisitor visitor = new CSVVisitor();
        assertEquals("email,mensagem\n\"SMS:teste@email.com\",\"Teste CSV\",\"", visitor.exibir(email));
    }

    @Test
    public void deveExibirPushNotificationCSV() {
        PushNotification push = new PushNotification("Dispositivo123", "Teste CSV");
        CSVVisitor visitor = new CSVVisitor();
        assertEquals("dispositivo,mensagem\n\"SMS:Dispositivo123\",\"Teste CSV\",\"", visitor.exibir(push));
    }
}